package com.mario.springcloudclient;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringCloudConfigClientApplication.class)
@WebAppConfiguration
class SpringCloudConfigClientApplicationTests {

	@Test
	void contextLoads() {
	}

}
