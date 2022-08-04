package com.scm.contract.coaChange.controller;

import com.scm.contract.coa.service.CoaServiceImpl;
import com.scm.contract.coaChange.model.ContractChangeInfoDto;
import com.scm.contract.coaChange.service.CoaChangeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("coaChange")
@Slf4j
public class ContractChangeController {

    @Autowired
    CoaChangeServiceImpl coaChangeService;

    @GetMapping("/info")
    public List<ContractChangeInfoDto> getCoaChangeInfo() {
        ContractChangeInfoDto contractChangeInfoDto = new ContractChangeInfoDto();

        return coaChangeService.getCoaChangeInfo();

    }
}
