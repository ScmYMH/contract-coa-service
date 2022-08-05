package com.scm.contract.coa.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@Component
public class ContractInfoDto {
    private String cntrtId;
    private String cntrtNm;
    private String cntrtScd;
    private String cntrtStartDate;
    private String cntrtEndDate;
    private String cntrtTcd;
    private String crePersonId;
    private String insDate;
    private String insPersonId;
    private String insTime;
    private String updDate;
    private String updPersonId;
    private String updTime;
    private String delYn;
    private String cntrtCurrCd;
}