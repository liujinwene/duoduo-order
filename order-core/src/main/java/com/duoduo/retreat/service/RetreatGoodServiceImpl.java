package com.duoduo.retreat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoduo.retreat.dao.RetreatGoodDao;

@Service
public class RetreatGoodServiceImpl implements RetreatGoodService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RetreatGoodServiceImpl.class);
    @Autowired
    private RetreatGoodDao testRetreatGoodDao;


}
