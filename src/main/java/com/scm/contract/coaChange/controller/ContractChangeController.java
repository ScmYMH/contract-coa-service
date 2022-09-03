package com.scm.contract.coaChange.controller;

import com.scm.contract.coa.service.CoaServiceImpl;
import com.scm.contract.coaChange.model.ContractChangeInfoDto;
import com.scm.contract.coaChange.service.CoaChangeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;
import java.util.List;

@RestController
@RequestMapping("coa/change")
@Slf4j
public class ContractChangeController {

    @Autowired
    CoaChangeServiceImpl coaChangeService;

    @GetMapping("/info/{cntrt_id}")
    public List<ContractChangeInfoDto> getCoaChangeInfo(@PathVariable String cntrt_id) {
        ContractChangeInfoDto contractChangeInfoDto = new ContractChangeInfoDto();

        return coaChangeService.getCoaChangeInfo(cntrt_id);

    }
}
