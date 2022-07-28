package com.scm.contract.coa.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class ContractInfoDto {

    private String cntrtId;
    private String cntrtTcd;
    private String cntrtNm;
    private String cntrtScd;
    private String crePersonId;
    private String cntrtStartDate;
    private String cntrtEndDate;
    private String cntrtCurrCd;
    private String delYn;
    private String insPersonId;
    private String insDate;
    private String insTime;
    private String updDate;
    private String updTime;
    private String updPersonId;

}