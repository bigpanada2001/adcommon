package org.adcommon.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.adcommon.dao.ShardingUserDao;
import org.adcommon.service.ShardingUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShardingUserServiceImpl implements ShardingUserService {
	@Resource
	@Qualifier(value="shardingUserDaoImpl")
	ShardingUserDao shardingUserDaoImpl;
	
	
	@Override
	public List getUsers() {
		return shardingUserDaoImpl.getUsers();
	}

}
