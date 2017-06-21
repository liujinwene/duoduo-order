package com.duoduo.configuration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.duoduo.configuration.service.ConfigurationService;

@RestController
public class ConfigurationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationController.class);
    @Autowired
    private ConfigurationService ConfigurationService;


}
