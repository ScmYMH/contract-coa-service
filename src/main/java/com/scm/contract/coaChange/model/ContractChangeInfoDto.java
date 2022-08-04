package com.scm.contract.coaChange.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ContractChangeInfoDto {

    private String cntrt_log_seq_no;
    private String upd_date;
    private String upd_time;
    private String cntrt_edit_comment;
    private String user_nm;

}
