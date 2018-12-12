package com.zhongda.kernel.dao;

import com.zhongda.kernel.entity.IEntity;

import tk.mybatis.mapper.common.Mapper;

public interface BaseMapper<T extends IEntity> extends Mapper<T>{

	// if have some special request add method and Implements
	
}
