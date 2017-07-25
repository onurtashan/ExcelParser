package com.tashan.excelparser.Service;

import com.tashan.excelparser.Model.ExcelParser;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by TCOTASHAN on 21.6.2017.
 */
public class ExcelParserService {

    public List<ExcelParser> parserResult (int isParsed) throws IOException {

        FileInputStream excelFile = new FileInputStream(new File("/Users/onurtashan/Downloads/Cekilisler_2.xlsx"));
        Workbook workbook = new XSSFWorkbook(excelFile);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = sheet.iterator();

        List<ExcelParser> a = new ArrayList<>();

        while(iterator.hasNext()) {
            Row currentRow = iterator.next();

            ExcelParser b = new ExcelParser();

            if(isParsed == 1){
                b.setBaslik(currentRow.getCell(0).toString());
                System.out.println(currentRow.getCell(0).toString());

                b.setIcerik(currentRow.getCell(1).toString());
                System.out.println(currentRow.getCell(1).toString());

                b.setBaslangic_tarihi(currentRow.getCell(2).toString());
                System.out.println(currentRow.getCell(2).toString());

                b.setBitis_tarihi(currentRow.getCell(3).toString());
                System.out.println(currentRow.getCell(3).toString());

                b.setCekilis_tarihi(currentRow.getCell(4).toString());
                System.out.println(currentRow.getCell(4).toString());

                b.setImgURL(currentRow.getCell(5).toString());
                System.out.println(currentRow.getCell(5).toString());

                a.add(b);


            }else {
                b.setBaslik("KAMPANYA BULUNAMADI");

                a.add(b);
            }
        }

        return a;
    }
}
