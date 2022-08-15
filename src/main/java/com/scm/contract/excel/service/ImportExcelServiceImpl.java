package com.scm.contract.excel.service;

import com.scm.contract.excel.model.ImportExcelDto;
import com.scm.contract.excel.repository.ImportExcelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ImportExcelServiceImpl implements ImportExcelService {

    @Autowired
    ImportExcelMapper importExcelMapper;

    @Override
    public boolean postImportExcelData(ImportExcelDto importExcelDto) {

        Date today = new Date();

        importExcelDto.setCntrt_id("20220501000003");
        importExcelDto.setDel_yn("N");
        importExcelDto.setIns_date(new SimpleDateFormat("yyyyMMdd").format(today));
        importExcelDto.setIns_time(new SimpleDateFormat("HHmmss").format(today));
        importExcelDto.setIns_person_id("202207130004");
        importExcelDto.setArr_cd(importExcelDto.getArr_cd());
        importExcelDto.setArr_nm(importExcelDto.getArr_nm());
        importExcelDto.setDep_cd(importExcelDto.getDep_cd());
        importExcelDto.setDep_nm(importExcelDto.getDep_nm());
        importExcelDto.setProd_gcd(importExcelDto.getProd_gcd());
        importExcelDto.setInco_cd(importExcelDto.getInco_cd());
        importExcelDto.setPay_curr_cd(importExcelDto.getPay_curr_cd());
        importExcelDto.setCntrt_curr_cd(importExcelDto.getCntrt_curr_cd());
        importExcelDto.setTrff_end_date(importExcelDto.getTrff_end_date());
        importExcelDto.setTrff_stat_date(importExcelDto.getTrff_stat_date());
        importExcelDto.setSub_lcc_cd(importExcelDto.getSub_lcc_cd());
        importExcelDto.setLcc_cd(importExcelDto.getLcc_cd());
        importExcelDto.setTrff_id("271313");
        importExcelDto.setVal_seq_no(1);
        importExcelDto.setCond_id(importExcelDto.getCond_id());
        importExcelDto.setCal_unit_cd(importExcelDto.getCal_unit_cd());
        importExcelDto.setUnit_price(importExcelDto.getUnit_price());
        importExcelDto.setCorp_id("PI");
        importExcelDto.setUpd_date(new SimpleDateFormat("yyyyMMdd").format(today));
        importExcelDto.setUpd_time(new SimpleDateFormat("HHmmss").format(today));
        importExcelDto.setUpd_person_id("202207130004");
        importExcelDto.setLcc_cd_desc(importExcelDto.getLcc_cd());


        return importExcelMapper.postImportExcelData(importExcelDto);
    }
}
