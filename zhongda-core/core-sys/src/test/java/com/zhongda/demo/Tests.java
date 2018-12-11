package com.zhongda.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.zhongda.CoreSysApplication;
import com.zhongda.sys.dao.DirtyWordsMapper;
import com.zhongda.sys.entity.DirtyWords;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringJUnitConfig(value=CoreSysApplication.class)
//@WebAppConfiguration
public class Tests {

	@Autowired
	private DirtyWordsMapper dirtyWordsMapper;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void TKTest() {
		try {
			List<DirtyWords> ds = dirtyWordsMapper.selectAll();
			for (DirtyWords dirtyWords : ds) {
				System.out.println(JSON.toJSONString(dirtyWords));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
