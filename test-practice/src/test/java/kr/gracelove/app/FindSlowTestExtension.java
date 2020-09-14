package kr.gracelove.app;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.logging.Logger;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/15
 */

public class FindSlowTestExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

	private static final Logger logger = Logger.getLogger(FindSlowTestExtension.class.getName());

	private static final long THRESHOLD = 1000L;

	@Override
	public void beforeTestExecution(ExtensionContext context) throws Exception {

		ExtensionContext.Store store = initStore(context);
		store.put("START_TIME", System.currentTimeMillis());
	}

	@Override
	public void afterTestExecution(ExtensionContext context) throws Exception {
		String testMethodName = context.getRequiredTestMethod().getName();
		ExtensionContext.Store store = initStore(context);
		Long startTime = store.remove("START_TIME", long.class);
		long duration = System.currentTimeMillis() - startTime;
		if (duration > THRESHOLD) {
			logger.info("테스트에 " + THRESHOLD + "L 이상 걸렸습니다. 메서드 명 : " + testMethodName);
		}
	}

	private ExtensionContext.Store initStore(ExtensionContext context) {
		String testClassName = context.getRequiredTestClass().getName();
		String testMethodName = context.getRequiredTestMethod().getName();
		return context.getStore(ExtensionContext.Namespace.create(testClassName, testMethodName));
	}
}
