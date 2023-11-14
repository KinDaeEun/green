package samp05;

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
public class BookAdvice {
	@Pointcut("execution(* getBook(String))")
	private void getBookPoint() {
	}
	@Before("getBookPoint()") // 본 메서드 시작 전에
	public void before() {
		System.out.println("before");
	}
	@Around("getBookPoint()") // 본 메서드 앞뒤로 실행
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("작업 전 around");
		Object obj = pjp.proceed();
		System.out.println("작업 후 around");
		return obj;
	}
	@After("getBookPoint()") // 본 메서드 종료 후에 실행
	public void after() {
		System.out.println("after");
	}
	@AfterReturning(value="getBookPoint()", returning = "book")
	public void afterReturn(Book book) {
		System.out.println("@AfterReturn : " + book);
	}
	// 실행중에 에러가 발생할 때
	@AfterThrowing(value="getBookPoint()", throwing = "e")
	public void afterTh(Throwable e) {
		System.out.println(e.getMessage());
	}
}
