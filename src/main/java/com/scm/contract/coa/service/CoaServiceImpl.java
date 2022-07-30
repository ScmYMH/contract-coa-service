package com.scm.contract.coa.service;

import com.scm.contract.coa.model.ContractAndMasterJoinDto;
import com.scm.contract.coa.model.ContractInfoDto;
import com.scm.contract.coa.model.TariffInfoDto;
import com.scm.contract.coa.repository.CoaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CoaServiceImpl {
    List<ContractInfoDto> getContractInfo();
    List<ContractAndMasterJoinDto> getContractInfoByConditions(ContractAndMasterJoinDto contractAndMasterJoinDto);
    List<TariffInfoDto> getTariffInfoByCntrtId(String cntrt_id, String svc_nm, String detl_svc_nm);
}
