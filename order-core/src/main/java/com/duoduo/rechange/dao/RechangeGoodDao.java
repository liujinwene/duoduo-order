package com.duoduo.rechange.dao;

import java.util.List;

import com.duoduo.rechange.cmd.ListRechangeGoodByCdCmd;
import com.duoduo.schema.tables.records.RechangeGoodRecord;

public interface RechangeGoodDao {
    void create(RechangeGoodRecord entity);
    void update(RechangeGoodRecord entity);
    void delete(RechangeGoodRecord entity);
    List<RechangeGoodRecord> listByCd(ListRechangeGoodByCdCmd cmd);
    RechangeGoodRecord findByCd(ListRechangeGoodByCdCmd cmd);
    RechangeGoodRecord findById(Long id);
    Integer findCountByCd(ListRechangeGoodByCdCmd cmd);
}
