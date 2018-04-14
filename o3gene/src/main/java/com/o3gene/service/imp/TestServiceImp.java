package com.o3gene.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o3gene.beans.UserReal;
import com.o3gene.dao.UserRealMapper;
import com.o3gene.service.TestService;



@Service
public class TestServiceImp implements TestService {
	@Autowired
	private UserRealMapper userMapper;

	@Override
	public UserReal selectByPrimaryKey(Integer id) {
		//TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

}
