package com.bs.apibs.client.aspect;

import java.util.Date;
import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggerAspect {
	private static final Logger LOG = LoggerFactory.getLogger(LoggerAspect.class);
	private static final String TAB_LOG = ">>>>>>>> ";

	public LoggerAspect() {
	}

	@Pointcut("within(@org.springframework.stereotype.Controller *)")
	public void controllerBean() {
		LOG.debug("controllerBean");
	}

	@Pointcut("within(@org.springframework.stereotype.Service *)")
	public void serviceBean() {
		LOG.debug("serviceBean");
	}

	@Pointcut("within(@org.springframework.stereotype.Repository *)")
	public void repositoryBean() {
		LOG.debug("repositoryBean");
	}

	@Pointcut("execution(* *(..))")
	public void methodPointcut() {
		LOG.debug("methodPointcut");
	}

	@Around("controllerBean() && methodPointcut()")
	public Object aroundControllerMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		LOG.debug(TAB_LOG + "invoking {}", joinPoint.getSignature());

		final Date start = new Date();
		final Object result = joinPoint.proceed();
		final Date end = new Date();
		LOG.debug(TAB_LOG + "return of {} with {}", joinPoint.getSignature(), BeanUtils.describe(result));
		LOG.debug(TAB_LOG + "end of {} take {} millisec", joinPoint.getSignature(), end.getTime() - start.getTime());
		return result;
	}

	@Around("serviceBean() && methodPointcut()")
	public Object aroundServiceMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		LOG.debug(TAB_LOG + "invoking {}", joinPoint.getSignature());

		final Date start = new Date();
		final Object result = joinPoint.proceed();
		final Date end = new Date();
		LOG.debug(TAB_LOG + "return of {} with {}", joinPoint.getSignature(), BeanUtils.describe(result));
		LOG.debug(TAB_LOG + "end of {} take {} millisec", joinPoint.getSignature(), end.getTime() - start.getTime());
		return result;
	}

	@Around("repositoryBean() && methodPointcut()")
	public Object aroundRepositoryMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		LOG.debug(TAB_LOG + "invoking {}", joinPoint.getSignature());

		final Date start = new Date();
		final Object result = joinPoint.proceed();
		final Date end = new Date();
		LOG.debug(TAB_LOG + "return of {} with {}", joinPoint.getSignature(), BeanUtils.describe(result));
		LOG.debug(TAB_LOG + "end of {} take {} millisec", joinPoint.getSignature(), end.getTime() - start.getTime());
		return result;
	}
}
