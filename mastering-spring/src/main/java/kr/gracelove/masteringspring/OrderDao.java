package kr.gracelove.masteringspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/20
 */

@Component
public class OrderDao {
	private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);

	public void placeOrder(int value) {
		logger.info("Placed Order - {} ", value);
	}
}
