package com.dream.tx.service;

import com.dream.tx.dao.TxDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TxService {

    @Autowired
    TxDao dao;

    @Transactional
    public void update(){
        dao.update();
        int i=10/0;
    }
}
