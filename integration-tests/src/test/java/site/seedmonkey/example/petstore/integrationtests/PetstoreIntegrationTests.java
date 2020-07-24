package site.seedmonkey.example.petstore.integrationtests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PetstoreIntegrationTests {

    @Autowired
	private RestTemplate restTemplate;

	@Test
	void contextLoads() {
	    System.out.println("I'm a test!");
	}

	@Test
	void secondTest() {
		ResponseEntity<Object> objectResponseEntity = restTemplate.postForEntity("http://localhost:8080/pets", null, Object.class);
		assertThat(objectResponseEntity.getStatusCode()).isEqualTo(HttpStatus.CREATED);
	}
}
