package com.tashan.excelparser.Controller;

import com.tashan.excelparser.Model.MongoSend;
import com.tashan.excelparser.Service.ExcelParserService;
import com.tashan.excelparser.Service.MongoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by onurtashan on 05/07/2017.
 */
@RestController
public class MongoController {
    @RequestMapping(value = "/mongosend")
    public MongoSend mongoSend(@RequestParam(value = "toSend", defaultValue = "") int toSend,
                               @RequestParam(value = "kampanyaNo", defaultValue = "") int kampanyaNo) throws IOException {

        String siraNo = new ExcelParserService().parserResult(toSend,kampanyaNo).getSiraNo();
        String duzenleyen = new ExcelParserService().parserResult(toSend, kampanyaNo).getDuzenleyen();
        String kampanyaBslgncBts = new ExcelParserService().parserResult(toSend, kampanyaNo).getKampanyaBslgncBts();
        String cekilisTarihi = new ExcelParserService().parserResult(toSend, kampanyaNo).getCekilisTarihi();
        String ilanTarihi = new ExcelParserService().parserResult(toSend, kampanyaNo).getIlanTarihi();
        String gazete = new ExcelParserService().parserResult(toSend, kampanyaNo).getGazete();


        new MongoService().insertMongo(siraNo, duzenleyen, kampanyaBslgncBts, cekilisTarihi, ilanTarihi, gazete);

        String sonuc = new MongoService().insertMongo(siraNo, duzenleyen, kampanyaBslgncBts, cekilisTarihi, ilanTarihi, gazete);

        return new MongoSend(sonuc);
    }

}
