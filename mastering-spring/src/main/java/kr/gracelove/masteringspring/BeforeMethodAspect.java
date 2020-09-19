package kr.gracelove.masteringspring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/20
 */

@Aspect
@Configuration
public class BeforeMethodAspect {

	private static final Logger logger = LoggerFactory.getLogger(BeforeMethodAspect.class);

	@Before("execution(* kr.gracelove.masteringspring.*Dao.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Before executing a method {}", joinPoint);
		logger.info("Arguments passed are {}", joinPoint.getArgs());
	}
}
