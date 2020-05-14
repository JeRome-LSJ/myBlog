package com.github.jerome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JeRome
 * @date 2020-05-13 23:31
 * @description
 */

@SpringBootApplication
@MapperScan("com.github.jerome.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
