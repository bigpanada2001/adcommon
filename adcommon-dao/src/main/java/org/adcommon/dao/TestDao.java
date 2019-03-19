package org.adcommon.dao;

import java.util.List;

public interface TestDao {
	public List getUsers();
	
	public int updateUser() throws Exception;
	public int updateRole() throws Exception;
}
