package com.scm.contract.coa.service;

import com.scm.contract.coa.model.CodeDefinitionDto;
import com.scm.contract.coa.model.ContractAndMasterJoinDto;
import com.scm.contract.coa.model.ContractInfoDto;
import com.scm.contract.coa.model.TariffInfoDto;
import com.scm.contract.coa.repository.CoaMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class CoaServiceImpl implements CoaService {

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

    @Override
    public boolean postContractInfo(ContractInfoDto contractInfoDto) {
        log.info(String.valueOf("before>>>>>>>>"+ contractInfoDto));
        Date today = new Date();
        contractInfoDto.setDelYn("N");
        contractInfoDto.setInsDate(new SimpleDateFormat("yyyyMMdd").format(today));
        contractInfoDto.setInsTime(new SimpleDateFormat("HHmmss").format(today));
        contractInfoDto.setUpdDate(new SimpleDateFormat("yyyyMMdd").format(today));
        contractInfoDto.setUpdTime(new SimpleDateFormat("HHmmss").format(today));
        contractInfoDto.setCntrtId(contractInfoDto.getCntrtId());
        contractInfoDto.setCntrtCurrCd(contractInfoDto.getCntrtCurrCd());
        contractInfoDto.setCntrtScd(contractInfoDto.getCntrtScd());
        contractInfoDto.setCntrtStartDate(contractInfoDto.getCntrtStartDate());
        contractInfoDto.setCntrtEndDate(contractInfoDto.getCntrtEndDate());
        contractInfoDto.setCntrtTcd("1090");
        contractInfoDto.setCrePersonId(contractInfoDto.getCrePersonId());
        contractInfoDto.setInsPersonId(contractInfoDto.getInsPersonId());
        contractInfoDto.setUpdPersonId(contractInfoDto.getUpdPersonId());

        log.info(String.valueOf("after>>>>>>>>"+ contractInfoDto));

        return coaMapper.postContractInfo(contractInfoDto);
    }

    @Override
    public List<CodeDefinitionDto> getCodeDefinition() {
        return coaMapper.getCodeDefinition();
    }
}