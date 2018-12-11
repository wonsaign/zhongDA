package com.zhongda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages="com.zhongda.sys.dao")
public class CoreSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreSysApplication.class, args);
	}
}
