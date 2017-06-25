package com.duoduo.rechange.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoduo.rechange.service.RechangeGoodService;

@RestController
@RequestMapping("/rechange")
public class RechangeGoodController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RechangeGoodController.class);
    @Autowired
    private RechangeGoodService RechangeGoodService;


}
