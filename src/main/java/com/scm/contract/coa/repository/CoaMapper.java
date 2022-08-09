package com.scm.contract.coa.repository;

import com.scm.contract.coa.model.CodeDefinitionDto;
import com.scm.contract.coa.model.ContractAndMasterJoinDto;
import com.scm.contract.coa.model.ContractInfoDto;
import com.scm.contract.coa.model.TariffInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoaMapper {
    List<ContractInfoDto> getContractInfo();
    List<ContractAndMasterJoinDto> getContractInfoByConditions(String cntrt_id, String cntrt_nm, String ins_date, String cd_v_meaning);
    List<TariffInfoDto> getTariffInfoByCntrtId(String cntrt_id, String svc_nm, String detl_svc_nm);

    List<CodeDefinitionDto> getCodeDefinition();

    boolean postContractInfo(ContractInfoDto contractInfoDto);
}
