package kr.gracelove.masteringspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/21
 */

@Component
public class Task {

	private static final Logger logger = LoggerFactory.getLogger(Task.class);

	@Scheduled(fixedDelay = 5000)
	public void execute() {
		logger.info("The time is now {}", new Date());
	}
}
