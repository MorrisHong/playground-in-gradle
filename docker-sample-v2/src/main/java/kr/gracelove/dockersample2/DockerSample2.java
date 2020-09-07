package kr.gracelove.dockersample2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/08
 */

@SpringBootApplication
public class DockerSample2 {
	public static void main(String[] args) {
		SpringApplication.run(DockerSample2.class, args);
	}

	@RestController
	static class DockerSample {
		@Value("${server.port}")
		private int port;

		@GetMapping("/")
		public String sample() {
			return "Hello World. Connected to " + port + ".";
		}
	}
}
