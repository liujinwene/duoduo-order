package com.duoduo.configuration.cmd;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class ListConfigurationByCdCmd {
    private Long id;
    private String name;
    private String value;
    private String description;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
