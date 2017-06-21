package com.duoduo.retreat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.duoduo.retreat.service.RetreatGoodService;

@RestController
public class RetreatGoodController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RetreatGoodController.class);
    @Autowired
    private RetreatGoodService RetreatGoodService;


}
