package com.demo.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.demo.springboot.model.User;

@Mapper
public interface UserMapper {	
	List<User> findAll();
}
