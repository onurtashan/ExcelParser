package com.tashan.excelparser.Service;

import com.tashan.excelparser.Model.ExcelParser;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by TCOTASHAN on 21.6.2017.
 */
public class ExcelParserService {

    public ExcelParser parserResult (int isParsed, int kampanyaNo) throws IOException {

        FileInputStream excelFile = new FileInputStream(new File("C:\\Users\\tcotashan\\Desktop\\Cekilisler.xlsx"));
        Workbook workbook = new XSSFWorkbook(excelFile);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = sheet.iterator();

        String siraNo = null;
        String duzenleyen = null;
        String kampanyaBslgncBts = null;
        String cekilisTarihi = null;
        String ilanTarihi = null;
        String gazete = null;

        while(iterator.hasNext()) {
            Row currentRow = iterator.next();

            if(kampanyaNo == currentRow.getRowNum() && isParsed == 1){
                siraNo = Integer.toString(currentRow.getRowNum());
                duzenleyen = currentRow.getCell(1).toString().replace("\n"," ");
                kampanyaBslgncBts = currentRow.getCell(5).toString();
                cekilisTarihi = currentRow.getCell(6).toString();
                ilanTarihi = currentRow.getCell(7).toString();
                gazete = currentRow.getCell(8).toString();

                break;
            }else {
                siraNo = "KAMPANYA BULUNAMADI";
                duzenleyen = "";
                kampanyaBslgncBts = "";
                cekilisTarihi = "";
                ilanTarihi = "";
                gazete = "";
            }
        }

        return new ExcelParser(siraNo, duzenleyen, kampanyaBslgncBts, cekilisTarihi, ilanTarihi, gazete);
    }
}
