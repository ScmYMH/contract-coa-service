package com.scm.contract.excel.repository;


import com.scm.contract.excel.model.ImportExcelDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImportExcelMapper {

    boolean postImportExcelData(ImportExcelDto importExcelDto);
}
