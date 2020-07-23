package site.seedmonkey.example.petstore.integrationtests.tests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class IntegrationTestsApplicationTests {

	@Test
	void contextLoads() {
	    System.out.println("I'm a test!");
	}
	@Test
	void secondTest() {
		System.out.println("I'm the other test!");
	}
}
