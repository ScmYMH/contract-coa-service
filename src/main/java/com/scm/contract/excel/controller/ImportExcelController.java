package com.scm.contract.excel.controller;

import com.scm.contract.excel.model.ImportExcelDto;
import com.scm.contract.excel.service.ImportExcelServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contract/tariff/import")
@Slf4j
public class ImportExcelController {

    @Autowired
    ImportExcelServiceImpl importExcelService;

    @PostMapping("")
    public boolean postImportExcelData(@RequestBody ImportExcelDto importExcelDto) {

        //List<ImportExcelDto> importExcelDto = mapImportExcelDto.get("data");

        return importExcelService.postImportExcelData(importExcelDto);
    }
}