package com.dream.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Random;
import java.util.UUID;

@Repository
public class TxDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public void update(){
        String sql="INSERT into  tab_user (name,age) VALUES(?,?)";
        String name=UUID.randomUUID().toString().substring(0,15);
        jdbcTemplate.update(sql,name,new Random().nextInt(12));
    }
}
