package com.github.jerome.myBlog;

import com.github.jerome.entity.User;
import com.github.jerome.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@MapperScan("com.github.jerome.mapper")
@SpringBootTest
class MyBlogApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
		List<User> user = userService.selectUserById(1L);
		System.out.println(user.toString());
	}

}
