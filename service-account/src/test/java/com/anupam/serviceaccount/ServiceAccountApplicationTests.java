package com.anupam.serviceaccount;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anupam.account.AccountController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AccountController.class)
public class ServiceAccountApplicationTests {

	@Test
	public void contextLoads() {
	}

}
