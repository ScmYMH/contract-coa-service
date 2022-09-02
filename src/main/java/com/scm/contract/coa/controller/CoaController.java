package com.scm.contract.coa.controller;

import com.scm.contract.coa.model.CodeDefinitionDto;
import com.scm.contract.coa.model.ContractAndMasterJoinDto;
import com.scm.contract.coa.model.ContractInfoDto;
import com.scm.contract.coa.model.TariffInfoDto;
import com.scm.contract.coa.service.CoaService;
import com.scm.contract.coa.service.CoaServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coa")
@Slf4j
public class CoaController {

    @Autowired
    CoaServiceImpl coaService;

    @PostMapping("")
    public boolean insertContractInfo(@RequestBody ContractInfoDto contractInfoDto){
        log.info(String.valueOf(contractInfoDto));
        return coaService.postContractInfo(contractInfoDto);
    }

    @PutMapping("")
    public Integer updateCntrtInfo(@RequestBody ContractInfoDto contractInfoDto){
        log.info(String.valueOf(contractInfoDto));
        return coaService.updateCntrtInfo(contractInfoDto);
    }

    @PutMapping("/{cntrtId}")
    public Integer deleteCntrtInfo(@PathVariable String cntrtId){
        return coaService.deleteCntrtInfo(cntrtId);
    }

    @GetMapping("/search")
    public List<ContractAndMasterJoinDto> getAllContractList(
            @RequestParam String cntrtId, @RequestParam String cntrtNm,
            @RequestParam String cdvMeaning, @RequestParam String insDate) {

        return coaService.getContractInfoByConditions(cntrtId, cntrtNm, insDate, cdvMeaning);
    }

    @GetMapping("/tariff")
    public List<TariffInfoDto> getTariffInfoByCntrtId(
            @RequestParam String cntrtId, @RequestParam String svcNm,
            @RequestParam String detlSvcNm) {
        return coaService.getTariffInfoByCntrtId(cntrtId, svcNm, detlSvcNm);
    }

    @GetMapping("/code")
    public List<CodeDefinitionDto> getCodeDefinition() {
        return coaService.getCodeDefinition();
    }

    @GetMapping("/newcntrtid")
    public String getAutoIncrementContractId() {
        return coaService.getAutoIncrementContractId();
    }



}
