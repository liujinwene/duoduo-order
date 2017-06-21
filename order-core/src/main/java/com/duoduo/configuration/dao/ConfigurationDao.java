package com.duoduo.configuration.dao;

import java.util.List;

import com.duoduo.configuration.cmd.ListConfigurationByCdCmd;
import com.duoduo.schema.tables.records.ConfigurationRecord;

public interface ConfigurationDao {
    void create(ConfigurationRecord entity);
    void update(ConfigurationRecord entity);
    void delete(ConfigurationRecord entity);
    List<ConfigurationRecord> listByCd(ListConfigurationByCdCmd cmd);
    ConfigurationRecord findByCd(ListConfigurationByCdCmd cmd);
    ConfigurationRecord findById(Long id);
    Integer findCountByCd(ListConfigurationByCdCmd cmd);
}
