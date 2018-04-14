package com.o3gene.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o3gene.beans.User;
import com.o3gene.dao.UserMapper;
import com.o3gene.service.UserSer;

@Service
public class UserSerImp implements UserSer{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public User selectByPhonum(String phonum) {
		// TODO Auto-generated method stub
		return userMapper.selectByPhonum(phonum);
	}

	@Override
	public int updatePS(User user) {
		// TODO Auto-generated method stub
		return userMapper.updatePS(user);
	}

}
