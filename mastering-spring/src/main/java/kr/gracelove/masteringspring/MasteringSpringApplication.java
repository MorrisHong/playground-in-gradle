package kr.gracelove.masteringspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;
import java.util.stream.IntStream;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class MasteringSpringApplication implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(MasteringSpringApplication.class);

	@Autowired
	private ShoppingService shoppingService;
	@Autowired
	private AsyncTask asyncTask;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MasteringSpringApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		shoppingService.checkAndPlaceOrder();
		asyncTask.doThisAsynchronously();
		IntStream.range(1, 100).forEach(x -> logger.info("TaskSchedulingApplication {}", x));
	}
}
