package com.tashan.excelparser.Controller;

import com.tashan.excelparser.Model.ExcelParser;
import com.tashan.excelparser.Service.ExcelParserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TCOTASHAN on 21.6.2017.
 */
@RestController
public class ExcelParserController {

    @RequestMapping(value="/excelparser")
    public List<ExcelParser> excelParser(@RequestParam(value = "isParsed", defaultValue = "") int isParsed) throws IOException {

        List<ExcelParser> a = new ArrayList<ExcelParser>();

        a = new ExcelParserService().parserResult(isParsed);

        return a;
    }
}
