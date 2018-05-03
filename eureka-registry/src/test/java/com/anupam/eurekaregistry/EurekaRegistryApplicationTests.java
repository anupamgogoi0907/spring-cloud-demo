package com.anupam.eurekaregistry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anupam.registry.AppRegistry;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AppRegistry.class)
public class EurekaRegistryApplicationTests {

	@Test
	public void contextLoads() {
	}

}
