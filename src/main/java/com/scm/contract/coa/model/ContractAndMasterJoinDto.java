package com.scm.contract.coa.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ContractAndMasterJoinDto {
    private String cntrt_nm;
    private String cd_v_meaning;
    private String cntrt_start_date;
    private String cntrt_end_date;
    private String user_nm;
    private String cntrt_id;
    private String ins_date;
    private String ins_person_id;
}
