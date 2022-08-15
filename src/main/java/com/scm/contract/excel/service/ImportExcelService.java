package com.scm.contract.excel.service;

import com.scm.contract.excel.model.ImportExcelDto;

public interface ImportExcelService {

    boolean postImportExcelData(ImportExcelDto importExcelDto);
}
