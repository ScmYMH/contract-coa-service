package com.scm.contract.excel.service;

import com.scm.contract.excel.model.ImportExcelDto;
import com.scm.contract.excel.repository.ImportExcelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ImportExcelServiceImpl implements ImportExcelService {

    @Autowired
    ImportExcelMapper importExcelMapper;


    @Override
    public Integer  postImportExcelData(List<ImportExcelDto> importExcelDto) {

        Date today = new Date();


        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCntrt_id("20220501000003"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setDel_yn("N"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setIns_date(new SimpleDateFormat("yyyyMMdd").format(today)));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setIns_time(new SimpleDateFormat("HHmmss").format(today)));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setIns_person_id("202207130004"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setArr_cd(importExcelDto1.getArr_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setArr_nm(importExcelDto1.getArr_nm()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setDep_cd(importExcelDto1.getDep_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setDep_nm(importExcelDto1.getDep_nm()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setProd_gcd(importExcelDto1.getProd_gcd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setInco_cd(importExcelDto1.getInco_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setPay_curr_cd(importExcelDto1.getPay_curr_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCntrt_curr_cd(importExcelDto1.getCntrt_curr_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setTrff_end_date(importExcelDto1.getTrff_end_date()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setTrff_stat_date(importExcelDto1.getTrff_stat_date()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setSub_lcc_cd(importExcelDto1.getSub_lcc_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setLcc_cd(importExcelDto1.getLcc_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setTrff_id(271313));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setVal_seq_no(1));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCond_id(importExcelDto1.getCond_id()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCond_nm(importExcelDto1.getCond_nm()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCal_unit_cd(importExcelDto1.getCal_unit_cd()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setUnit_price(importExcelDto1.getUnit_price()));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setCorp_id("PI"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setUpd_date(new SimpleDateFormat("yyyyMMdd").format(today)));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setUpd_time(new SimpleDateFormat("HHmmss").format(today)));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setUpd_person_id("202207130004"));
        importExcelDto.forEach(importExcelDto1 -> importExcelDto1.setLcc_cd_desc(importExcelDto1.getLcc_cd_desc()));

//        importExcelDto.setCntrt_id("20220501000003");
//        importExcelDto.setDel_yn("N");
//        importExcelDto.setIns_date(new SimpleDateFormat("yyyyMMdd").format(today));
//        importExcelDto.setIns_time(new SimpleDateFormat("HHmmss").format(today));
//        importExcelDto.setIns_person_id("202207130004");
//        importExcelDto.setArr_cd(importExcelDto.getArr_cd());
//        importExcelDto.setArr_nm(importExcelDto.getArr_nm());
//        importExcelDto.setDep_cd(importExcelDto.getDep_cd());
//        importExcelDto.setDep_nm(importExcelDto.getDep_nm());
//        importExcelDto.setProd_gcd(importExcelDto.getProd_gcd());
//        importExcelDto.setInco_cd(importExcelDto.getInco_cd());
//        importExcelDto.setPay_curr_cd(importExcelDto.getPay_curr_cd());
//        importExcelDto.setCntrt_curr_cd(importExcelDto.getCntrt_curr_cd());
//        importExcelDto.setTrff_end_date(importExcelDto.getTrff_end_date());
//        importExcelDto.setTrff_stat_date(importExcelDto.getTrff_stat_date());
//        importExcelDto.setSub_lcc_cd(importExcelDto.getSub_lcc_cd());
//        importExcelDto.setLcc_cd(importExcelDto.getLcc_cd());
//        importExcelDto.setTrff_id(271313);
//        importExcelDto.setVal_seq_no(1);
//        importExcelDto.setCond_id(importExcelDto.getCond_id());
//        importExcelDto.setCond_nm(importExcelDto.getCond_nm());
//        importExcelDto.setCal_unit_cd(importExcelDto.getCal_unit_cd());
//        importExcelDto.setUnit_price(importExcelDto.getUnit_price());
//        importExcelDto.setCorp_id("PI");
//        importExcelDto.setUpd_date(new SimpleDateFormat("yyyyMMdd").format(today));
//        importExcelDto.setUpd_time(new SimpleDateFormat("HHmmss").format(today));
//        importExcelDto.setUpd_person_id("202207130004");
//        importExcelDto.setLcc_cd_desc(importExcelDto.getLcc_cd_desc());


        importExcelMapper.postImportExcelData(importExcelDto);
        importExcelMapper.postImportExcelData2(importExcelDto);

        return null;
    }
}
