package com.scm.contract.coa.service;

import com.scm.contract.coa.entity.ContractInfoEntity;
import com.scm.contract.coa.model.ContractInfoDto;
import com.scm.contract.coa.repository.CoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class CoaService {

    @Autowired
    CoaRepository coaRepository;

    public List<ContractInfoEntity> getAllContractList() {
        return coaRepository.findAll();
    }
//
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

    public List<ContractInfoEntity> testAll(){
        return coaRepository.testAll();
    }
}
