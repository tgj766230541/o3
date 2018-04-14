package com.o3gene.service;

import org.springframework.stereotype.Service;

import com.o3gene.beans.User;

public interface UserSer {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByPhonum(String phonum);
    
    int updatePS(User user);
}
