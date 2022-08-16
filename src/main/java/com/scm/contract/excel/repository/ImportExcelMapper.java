package com.scm.contract.excel.repository;


import com.scm.contract.excel.model.ImportExcelDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImportExcelMapper {

    boolean postImportExcelData(List<ImportExcelDto> importExcelDto);

    boolean postImportExcelData2(List<ImportExcelDto> importExcelDto);

}
