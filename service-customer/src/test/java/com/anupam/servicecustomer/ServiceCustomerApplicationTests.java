package com.anupam.servicecustomer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anupam.customer.CustomerController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CustomerController.class)
public class ServiceCustomerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
