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

//    public List<ContractInfoEntity> getAllContractList() {
//        return coaRepository.findAll();
//    }

//    public Stream<ContractInfoDto> getContractList(String cntrtId, String cntrtNm, String cntrtScd, String insDate){
//        List<ContractInfoEntity> contractInfo = coaRepository.findByCntrtIdContainingAndCntrtIdContainingAndCntrtScdContainingAndInsDateContaining(cntrtId, cntrtNm, cntrtScd, insDate);
//
//        ContractInfoDto contractInfoDto = new ContractInfoDto();
//
//        Stream<ContractInfoDto> contractInfoData = contractInfo.stream().map(data -> {
//            contractInfoDto.setCntrtId(data.getCntrtId());
//            contractInfoDto.setCntrtTcd(data.getCntrtTcd());
//            contractInfoDto.setCntrtNm(data.getCntrtNm());
//            contractInfoDto.setCntrtScd(data.getCntrtScd());
//            contractInfoDto.setCrePersonId(data.getCrePersonId());
//            contractInfoDto.setCntrtStartDate(data.getCntrtStartDate());
//            contractInfoDto.setCntrtEndDate(data.getCntrtEndDate());
//            contractInfoDto.setCntrtCurrCd(data.getCntrtCurrCd());
//            contractInfoDto.setDelYn(data.getDelYn());
//            contractInfoDto.setInsDate(data.getInsDate());
//            contractInfoDto.setInsTime(data.getInsTime());
//            contractInfoDto.setInsPersonId(data.getInsPersonId());
//            contractInfoDto.setUpdDate(data.getUpdDate());
//            contractInfoDto.setUpdTime(data.getUpdTime());
//            contractInfoDto.setUpdPersonId(data.getUpdPersonId());
//            return contractInfoDto;
//        });
//        return contractInfoData;
//    }
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
