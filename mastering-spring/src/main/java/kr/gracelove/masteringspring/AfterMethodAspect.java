package kr.gracelove.masteringspring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/20
 */

@Aspect
@Configuration
public class AfterMethodAspect {

	private static final Logger logger = LoggerFactory.getLogger(AfterMethodAspect.class);

	@After("execution(* kr.gracelove.masteringspring.*Dao.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("After executing a method {}", joinPoint);
		logger.info("Arguments passed are {}", joinPoint.getArgs());
	}
}
