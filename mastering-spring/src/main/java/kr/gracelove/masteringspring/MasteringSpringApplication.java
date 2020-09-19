package kr.gracelove.masteringspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MasteringSpringApplication implements ApplicationRunner {

	@Autowired
	private ShoppingService shoppingService;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MasteringSpringApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		shoppingService.checkAndPlaceOrder();
	}
}
