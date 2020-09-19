package kr.gracelove.masteringspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/20
 */

@Service
public class ShoppingService {
	private static final Logger logger = LoggerFactory.getLogger(ShoppingService.class);
	@Autowired
	private StockDao stockDao;
	@Autowired
	private OrderDao orderDao;

	public void checkAndPlaceOrder() {
		int availableQuantity = stockDao.retrieveStock().getQuantity();
		logger.info("Retrieve Stock - {}", availableQuantity);
		if (availableQuantity > 0) {
			orderDao.placeOrder(availableQuantity);
		}
	}
}
