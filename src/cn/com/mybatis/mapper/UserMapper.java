package cn.com.mybatis.mapper;

import java.util.List;

import cn.com.mybatis.bean.User;

public interface UserMapper {
	void save(User user) throws Exception;
	List<User> findAllUser() throws Exception;
	
}
