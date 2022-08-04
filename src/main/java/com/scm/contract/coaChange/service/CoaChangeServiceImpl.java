package com.scm.contract.coaChange.service;

import com.scm.contract.coa.repository.CoaMapper;
import com.scm.contract.coaChange.model.ContractChangeInfoDto;
import com.scm.contract.coaChange.repository.CoaChangeMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoaChangeServiceImpl implements CoaChangeService{

    @Autowired
    CoaChangeMapper coaChangeMapper;
    @Override
    public List<ContractChangeInfoDto> getCoaChangeInfo() {

        return coaChangeMapper.getCoaChangeInfo();
    }
}
