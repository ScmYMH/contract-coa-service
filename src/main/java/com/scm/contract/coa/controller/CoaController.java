package com.scm.contract.coa.controller;

import com.scm.contract.coa.entity.ContractInfoEntity;
import com.scm.contract.coa.model.ContractAndMasterJoinDto;
import com.scm.contract.coa.model.ContractInfoDto;
import com.scm.contract.coa.model.TariffInfoDto;
import com.scm.contract.coa.service.CoaService;
import com.scm.contract.coa.service.CoaServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("coa")
@Slf4j
public class CoaController {

    @Autowired
    CoaServiceImpl coaService;

    @GetMapping("/search")
    public List<ContractAndMasterJoinDto> getAllContractList(
            @RequestParam String cntrtId, @RequestParam String cntrtNm,
            @RequestParam String cdvMeaning, @RequestParam String insDate) {
        ContractAndMasterJoinDto contractAndMasterJoinDto = new ContractAndMasterJoinDto();
        contractAndMasterJoinDto.setCntrt_id(cntrtId);
        contractAndMasterJoinDto.setCntrt_nm(cntrtNm);
        contractAndMasterJoinDto.setIns_date(insDate);
        contractAndMasterJoinDto.setCd_v_meaning(cdvMeaning);

        return coaService.getContractInfoByConditions(contractAndMasterJoinDto);
    }

    @GetMapping("/tariff")
    public List<TariffInfoDto> getTariffInfoByCntrtId(
            @RequestParam String cntrtId, @RequestParam String svcNm,
            @RequestParam String detlSvcNm) {
        return coaService.getTariffInfoByCntrtId(cntrtId, svcNm, detlSvcNm);
    }


//    @GetMapping("/search")
//    public Stream<ContractInfoDto> getContractInfo(@RequestParam String cntrtId, @RequestParam String cntrtNm,  @RequestParam String cntrtScd, @RequestParam String insDate) {
//        log.info("---------------");
//        return coaService.getContractList( cntrtId, cntrtNm, cntrtScd, insDate);
//    }

}
