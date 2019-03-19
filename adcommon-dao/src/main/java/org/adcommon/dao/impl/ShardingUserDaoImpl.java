package org.adcommon.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.adcommon.dao.ShardingUserDao;
import org.adcommon.dao.TestDao;
import org.adcommon.jdbc.Jdbc;
import org.adcommon.model.security.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ShardingUserDaoImpl implements ShardingUserDao {

	@Resource
	@Qualifier(value="jdbcShardingMysqlImpl")
	Jdbc jdbc;
	
	@Override
	public List getUsers() {
		List<User> rst = jdbc.queryForList("select * from user", User.class);
		return rst;
	}
	
}
