package com.scm.contract.coa.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@Component
public class ContractInfoDto {
    private String cntrt_id;
    private String cntrt_tcd;
    private String cntrt_nm;
    private String cntrt_scd;
    private String cre_person_id;
    private String cntrt_start_date;
    private String cntrt_end_date;
    private String cntrt_curr_dd;
    private String del_yn;
    private String ins_person_id;
    private String ins_date;
    private String ins_time;
    private String upd_date;
    private String upd_time;
    private String upd_person_id;
}