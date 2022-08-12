package com.scm.contract.coa.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TariffInfoDto {
    private String trff_nm;
    private String trff_desc;
    private String biz_nm;
    private String svc_nm;
    private String detl_svc_nm;
    private String ins_date;
    private String detl_svc_tcd;
    private String trff_id;
}
