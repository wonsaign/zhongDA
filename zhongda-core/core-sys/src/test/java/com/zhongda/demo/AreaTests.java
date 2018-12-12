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
import com.zhongda.sys.dao.SysAreaMapper;
import com.zhongda.sys.dao.SysTeacherMapper;
import com.zhongda.sys.entity.SysArea;
import com.zhongda.sys.entity.SysTeacher;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringJUnitConfig(value=CoreSysApplication.class)
//@WebAppConfiguration
public class AreaTests {

	@Autowired
	private SysAreaMapper sysAreaMapper;
	@Autowired
	private SysTeacherMapper sysTeacherMapper;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void normalTest() {
		try {
			SysArea sa = sysAreaMapper.selectByPrimaryKey(1);
			//dirtyWordsMapper.selectByExampleAndRowBounds(example, rowBounds)
			System.out.println(JSON.toJSONString(sa));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TKTest() {
		try {
			List<SysTeacher> sa = sysTeacherMapper.selectAll();
			//dirtyWordsMapper.selectByExampleAndRowBounds(example, rowBounds)
			for (SysTeacher a : sa) {
				System.out.println(JSON.toJSONString(a));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
