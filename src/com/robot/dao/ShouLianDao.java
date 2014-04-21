package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IShouLianDao;
import com.robot.model.ShouLian;


@Repository("shouLianDao")
public class ShouLianDao extends DBaseDao<ShouLian> implements IShouLianDao {

}
