package com.zt.mybatis_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zt.mybatis_springboot.dao")
public class MybatisSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringbootApplication.class, args);
	}
}
