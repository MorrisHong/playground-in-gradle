package kr.gracelove.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/15
 */

class TestDemo {

	@RegisterExtension
	static FindSlowTestExtension findSlowTestExtension = new FindSlowTestExtension();

	@Test
	void slowTest() throws InterruptedException {
		Thread.sleep(1500L);
	}

}
