package kr.gracelove.masteringspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/20
 */

@Component
public class StockDao {

	private static final Logger logger = LoggerFactory.getLogger(StockDao.class);

	public Stock retrieveStock() {
		logger.info("Returning a dummy value");
		return new Stock(20);
	}
}
