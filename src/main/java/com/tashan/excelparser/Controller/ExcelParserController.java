package com.tashan.excelparser.Controller;

import com.tashan.excelparser.Model.ExcelParser;
import com.tashan.excelparser.Service.ExcelParserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by TCOTASHAN on 21.6.2017.
 */
@RestController
public class ExcelParserController {

    @RequestMapping(value="/excelparser")
    public ExcelParser excelParser(@RequestParam(value = "isParsed", defaultValue = "") int isParsed,
                                   @RequestParam(value = "kampanyaNo", defaultValue = "") int kampanyaNo) throws IOException {

        String siraNo = new ExcelParserService().parserResult(isParsed,kampanyaNo).getSiraNo();
        String duzenleyen = new ExcelParserService().parserResult(isParsed, kampanyaNo).getDuzenleyen();
        String kampanyaBslgncBts = new ExcelParserService().parserResult(isParsed, kampanyaNo).getKampanyaBslgncBts();
        String cekilisTarihi = new ExcelParserService().parserResult(isParsed, kampanyaNo).getCekilisTarihi();
        String ilanTarihi = new ExcelParserService().parserResult(isParsed, kampanyaNo).getIlanTarihi();
        String gazete = new ExcelParserService().parserResult(isParsed, kampanyaNo).getGazete();



        return new ExcelParser(siraNo, duzenleyen,kampanyaBslgncBts,cekilisTarihi,ilanTarihi,gazete);
    }
}
