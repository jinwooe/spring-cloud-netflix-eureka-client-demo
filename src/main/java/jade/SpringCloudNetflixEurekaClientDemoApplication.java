package jade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class SpringCloudNetflixEurekaClientDemoApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello, World";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixEurekaClientDemoApplication.class, args);
	}
}
