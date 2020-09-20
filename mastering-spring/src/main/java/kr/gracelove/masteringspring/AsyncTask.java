package kr.gracelove.masteringspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/21
 */

@Component
public class AsyncTask {
	private static final Logger logger = LoggerFactory.getLogger(AsyncTask.class);

	@Async
	void doThisAsynchronously() {
		IntStream.range(1, 100).forEach(x -> logger.info("AsyncTask {}", x));
	}
}
