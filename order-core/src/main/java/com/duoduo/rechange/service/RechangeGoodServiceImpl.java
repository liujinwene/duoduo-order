package com.duoduo.rechange.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoduo.rechange.dao.RechangeGoodDao;

@Service
public class RechangeGoodServiceImpl implements RechangeGoodService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RechangeGoodServiceImpl.class);
    @Autowired
    private RechangeGoodDao testRechangeGoodDao;


}
