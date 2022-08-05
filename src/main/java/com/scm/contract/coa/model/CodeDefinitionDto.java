package com.scm.contract.coa.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CodeDefinitionDto {
    private String cd_tp;
    private String cd_tp_meaning;
    private String cd_v;
    private String cd_v_meaning;
}
