package com.scm.contract.coa.controller;

import com.scm.contract.coa.entity.ContractInfoEntity;
import com.scm.contract.coa.model.ContractInfoDto;
import com.scm.contract.coa.service.CoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("coa")
@Slf4j
public class CoaController {

    @Autowired
    CoaService coaService;

    @GetMapping("")
    public List<ContractInfoEntity> getAllContractList() {
        return coaService.testAll();
    }
//    @GetMapping("/search")
//    public Stream<ContractInfoDto> getContractInfo(@RequestParam String cntrtId, @RequestParam String cntrtNm,  @RequestParam String cntrtScd, @RequestParam String insDate) {
//        log.info("---------------");
//        return coaService.getContractList( cntrtId, cntrtNm, cntrtScd, insDate);
//    }

}
