package com.scm.contract.coaChange.repository;

import com.scm.contract.coaChange.model.ContractChangeInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoaChangeMapper {


    List<ContractChangeInfoDto> getCoaChangeInfo();
}
