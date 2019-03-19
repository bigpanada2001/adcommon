package org.adcommon.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.adcommon.dao.Test1Dao;
import org.adcommon.dao.TestDao;
import org.adcommon.jdbc.Jdbc;
import org.adcommon.model.security.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Test1DaoImpl implements Test1Dao {

	@Autowired
	TestDao testDaoImpl;
	@Resource
	@Qualifier(value="jdbcShardingMysqlImpl")
	Jdbc jdbc;
	
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void updateTest() throws Exception {
//		int rst =jdbc.update("update permission set name='首页（真实）---' where id=1");
		testDaoImpl.updateUser();
		testDaoImpl.updateRole();
//		try {
//			if(1 == 1) {
//				throw new Exception();
//			}
//		} catch(Exception e) {
//			System.out.println("-----------Test1DaoImpl exception...");
//		}
	}
	
}
