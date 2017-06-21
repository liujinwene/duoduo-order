package com.duoduo.retreat.dao;

import java.util.List;

import com.duoduo.retreat.cmd.ListRetreatGoodByCdCmd;
import com.duoduo.schema.tables.records.RetreatGoodRecord;

public interface RetreatGoodDao {
    void create(RetreatGoodRecord entity);
    void update(RetreatGoodRecord entity);
    void delete(RetreatGoodRecord entity);
    List<RetreatGoodRecord> listByCd(ListRetreatGoodByCdCmd cmd);
    RetreatGoodRecord findByCd(ListRetreatGoodByCdCmd cmd);
    RetreatGoodRecord findById(Long id);
    Integer findCountByCd(ListRetreatGoodByCdCmd cmd);
}
