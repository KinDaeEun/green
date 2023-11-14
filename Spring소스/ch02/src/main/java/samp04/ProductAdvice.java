package samp04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductAdvice {
	@Pointcut("execution(* getProduct(String))")
	private void helloPointcut() {
	}

	@Before("helloPointcut()") // 본 메서드 시작 전에
	public void before() {
		System.out.println("before");
	}

	@Around("helloPointcut()") // 본 메서드 앞뒤로 실행
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("작업 전 around");
		Object obj = pjp.proceed();
		System.out.println("작업 후 around");
		return obj;
	}

	@After("helloPointcut()") // 본 메서드 종료 후에 실행
	public void after() {
		System.out.println("after");
	}

	// 본 메서드 종료 후에 결과를 받는 객체
	@AfterReturning(pointcut = "helloPointcut()", returning = "product")
	public void afterReturn(Product product) {
		System.out.println("@AfterReturn : " + product);
	}

	// 실행중에 에러가 발생할 때
	@AfterThrowing(pointcut = "helloPointcut()", throwing = "e")
	public void afterThrowing(Throwable e) {
		System.out.println(e.getMessage());
	}
}
