package site.seedmonkey.example.petstore.integrationtests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IntegrationTestsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(IntegrationTestsApplication.class, args);
		run.close();
	}

}
