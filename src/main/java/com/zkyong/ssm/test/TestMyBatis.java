package com.zkyong.ssm.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zkyong.ssm.model.UserT;
import com.zkyong.ssm.service.UserTService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);

	@Autowired
	private UserTService userTService = null;

	@Test
	public void test1() {
		UserT user = userTService.getUserById(1);
		System.out.println(user.getUserName());
		logger.info("值：" + user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
}