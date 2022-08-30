package com.scm.contract.coa.service;

import com.scm.contract.coa.model.CodeDefinitionDto;
import com.scm.contract.coa.model.ContractAndMasterJoinDto;
import com.scm.contract.coa.model.ContractInfoDto;
import com.scm.contract.coa.model.TariffInfoDto;

import java.util.List;


public interface CoaService {
    List<ContractInfoDto> getContractInfo();
    List<ContractAndMasterJoinDto> getContractInfoByConditions(String cntrt_id, String cntrt_nm, String ins_date, String cd_v_meaning);
    List<TariffInfoDto> getTariffInfoByCntrtId(String cntrt_id, String svc_nm, String detl_svc_nm);
    boolean postContractInfo(ContractInfoDto contractInfoDto);
    String getAutoIncrementContractId();
    List<CodeDefinitionDto> getCodeDefinition();
    Integer updateCntrtInfo(ContractInfoDto contractInfoDto);
    Integer deleteCntrtInfo(String cntrtId);
}
