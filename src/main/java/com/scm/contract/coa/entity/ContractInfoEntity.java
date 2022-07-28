package com.scm.contract.coa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "TB_CNTRT_INFO", schema = "TCMS")
public class ContractInfoEntity {
    @Id
    @Column(name = "CNTRT_ID")
    private String cntrtId;
    @Column(name = "CNTRT_TCD")
    private String cntrtTcd;
    @Column(name = "CNTRT_NM")
    private String cntrtNm;
    @Column(name = "CNTRT_SCD")
    private String cntrtScd;
    @Column(name = "CRE_PERSON_ID")
    private String crePersonId;
    @Column(name = "CNTRT_START_DATE")
    private String cntrtStartDate;
    @Column(name = "CNTRT_END_DATE")
    private String cntrtEndDate;
    @Column(name = "CNTRT_CURR_CD")
    private String cntrtCurrCd;
    @Column(name = "DEL_YN")
    private String delYn;

    @Column(name = "INS_PERSON_ID")
    private String insPersonId;

    @Column(name = "INS_DATE")
    private String insDate;

    @Column(name = "INS_TIME")
    private String insTime;

    @Column(name = "UPD_DATE")
    private String updDate;

    @Column(name = "UPD_TIME")
    private String updTime;

    @Column(name = "UPD_PERSON_ID")
    private String updPersonId;
}
