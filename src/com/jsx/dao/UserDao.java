package com.jsx.dao;

import java.util.List;

import com.jsx.model.User;

public interface UserDao
{
    int insert(User user);

    int insertSelective(User user);

    int deleteByPrimaryKey(int id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);

    User selectByPrimaryKey(int id);

    List<User> getAll();

    User selectByUsernameAndPassword(User user);
}
