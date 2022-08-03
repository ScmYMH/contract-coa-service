package com.scm.contract.coa.service;

import com.scm.contract.coa.model.ContractAndMasterJoinDto;
import com.scm.contract.coa.model.ContractInfoDto;
import com.scm.contract.coa.model.TariffInfoDto;
import com.scm.contract.coa.repository.CoaMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CoaService implements CoaServiceImpl{

    @Autowired
    CoaMapper coaMapper;

    @Override
    public List<ContractInfoDto> getContractInfo() {
        return coaMapper.getContractInfo();
    }

    @Override
    public List<ContractAndMasterJoinDto> getContractInfoByConditions(ContractAndMasterJoinDto contractAndMasterJoinDto) {
        return coaMapper.getContractInfoByConditions(contractAndMasterJoinDto);
    }

    @Override
    public List<TariffInfoDto> getTariffInfoByCntrtId(String cntrt_id, String svc_nm, String detl_svc_nm) {
        return coaMapper.getTariffInfoByCntrtId(cntrt_id, svc_nm, detl_svc_nm);
    }
}