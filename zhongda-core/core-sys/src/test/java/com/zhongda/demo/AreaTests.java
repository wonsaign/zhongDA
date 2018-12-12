package com.zhongda.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
			// way1
			PageInfo<SysTeacher> pis = PageHelper.startPage(1, 20).doSelectPageInfo(
					() -> sysTeacherMapper.selectAll());
			System.err.println(JSON.toJSONString(pis));
			// way2
			PageHelper.startPage(1, 20);
			System.err.println(sysTeacherMapper.selectAll().size());
			// way3 It is Good
			PageHelper.startPage(1, 20);
			PageInfo<SysTeacher> userPageInfo = new PageInfo<>(sysTeacherMapper.selectAll());
			System.out.println(JSON.toJSONString(userPageInfo));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
