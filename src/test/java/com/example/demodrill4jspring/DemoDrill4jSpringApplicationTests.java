package com.example.demodrill4jspring;

import com.example.demodrill4jspring.demo_post.PostObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoDrill4jSpringApplicationTests {

	@Test
	public void contextLoads() {
		String login = "login";
		String password = "password";
		PostObject postObject = new PostObject(login, password);
		Assert.isTrue(postObject.getLogin().equals(login), "Wrong object data.");
		Assert.isTrue(postObject.getPassword().equals(password), "Wrong object data.");
	}
}
