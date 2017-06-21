package com.duoduo.configuration.dao;

import java.sql.Timestamp;
import java.util.List;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.duoduo.configuration.cmd.ListConfigurationByCdCmd;
import com.duoduo.schema.Tables;
import com.duoduo.schema.tables.records.ConfigurationRecord;

@Component
public class ConfigurationDaoImpl implements ConfigurationDao {

    @Autowired
    private DSLContext dsl;

    @Override
    public void create(ConfigurationRecord record) {
        dsl.executeInsert(record);
    }

    @Override
    public void update(ConfigurationRecord record) {
        dsl.executeUpdate(record);
    }

    @Override
    public void delete(ConfigurationRecord record) {
        dsl.executeDelete(record);
    }

    @Override
    public List<ConfigurationRecord> listByCd(ListConfigurationByCdCmd cmd) {
        SelectQuery<ConfigurationRecord>  query = dsl.selectQuery(Tables.CONFIGURATION);
        addCondition(query, cmd);
        return query.fetch();
    }

    @Override
    public ConfigurationRecord findByCd(ListConfigurationByCdCmd cmd) {
        SelectQuery<ConfigurationRecord>  query = dsl.selectQuery(Tables.CONFIGURATION);
        addCondition(query, cmd);
        return query.fetchOne();
    }

    @Override
    public ConfigurationRecord findById(Long id) {
        SelectQuery<ConfigurationRecord>  query = dsl.selectQuery(Tables.CONFIGURATION);
        query.addConditions(Tables.CONFIGURATION.ID.eq(id));
        return query.fetchOne();
    }

    @Override
    public Integer findCountByCd(ListConfigurationByCdCmd cmd) {
        SelectQuery<ConfigurationRecord>  query = dsl.selectQuery(Tables.CONFIGURATION);
        addCondition(query, cmd);
        return dsl.fetchCount(query);
    }

    private void addCondition(SelectQuery<ConfigurationRecord> query, ListConfigurationByCdCmd cmd) {
        Condition condition = null;
        if(cmd.getId() != null) {
            if(condition == null) {
                condition = Tables.CONFIGURATION.ID.eq(cmd.getId());
            } else {
                condition = condition.and(Tables.CONFIGURATION.ID.eq(cmd.getId()));
            }
        }
        if(cmd.getName() != null) {
            if(condition == null) {
                condition = Tables.CONFIGURATION.NAME.eq(cmd.getName());
            } else {
                condition = condition.and(Tables.CONFIGURATION.NAME.eq(cmd.getName()));
            }
        }
        if(cmd.getValue() != null) {
            if(condition == null) {
                condition = Tables.CONFIGURATION.VALUE.eq(cmd.getValue());
            } else {
                condition = condition.and(Tables.CONFIGURATION.VALUE.eq(cmd.getValue()));
            }
        }
        if(cmd.getDescription() != null) {
            if(condition == null) {
                condition = Tables.CONFIGURATION.DESCRIPTION.eq(cmd.getDescription());
            } else {
                condition = condition.and(Tables.CONFIGURATION.DESCRIPTION.eq(cmd.getDescription()));
            }
        }
        query.addConditions(condition);
    }

}
