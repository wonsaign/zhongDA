package com.zhongda.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhongda.CoreSysApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringJUnitConfig(value=CoreSysApplication.class)
//@WebAppConfiguration
public class Tests {

	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void TKTest() {
		try {
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
