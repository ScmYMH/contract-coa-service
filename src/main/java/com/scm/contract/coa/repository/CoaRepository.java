package com.scm.contract.coa.repository;

import com.scm.contract.coa.entity.ContractInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoaRepository extends JpaRepository<ContractInfoEntity, String>{
    List<ContractInfoEntity> findAll();

//    List<ContractInfoEntity> findByCntrtIdContainingAndCntrtIdContainingAndCntrtScdContainingAndInsDateContaining(String cntrtId, String cntrtNm, String cntrtScd, String insDate);

    public String testQuery = "select cntrt_id from TCMS.TB_CNTRT_INFO";
//    public String testQuery =
//        "SELECT " +
//            "a.cntrt_nm, b.cd_v_meaning, a.cntrt_start_date, a.cntrt_end_date, a.user_nm, a.cntrt_id " +
//        "FROM " +
//            "(" +
//                " SELECT " +
//                    "tci.cntrt_nm, tci.cntrt_scd, tci.cntrt_start_date, tci.cntrt_end_date, tui.user_nm, tci.cntrt_id, tci.ins_date" +
//                " FROM " +
//                    "tcms.tb_cntrt_info tci" +
//                " JOIN " +
//                    "(SELECt user_nm, user_id FROM tcom.tb_user_info) tui " +
//                " ON " +
//                    "tui.user_id = tci.cre_person_id" +
//            ") a " +
//        "JOIN " +
//            "(SELECT cd_v, cd_v_meaning FROM tcom.tb_code_definition) b " +
//        "ON " +
//            "b.cd_v = a.cntrt_scd";
    @Query(value = testQuery, nativeQuery = true)
    public List<ContractInfoEntity> testAll();
}

