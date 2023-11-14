package ch15;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


//@WebFilter("/sub1/*")//sub1있는 건만 필터작동
@WebFilter(urlPatterns = {"/sub1/*","/sub2/*"})
public class Sub1Filter extends HttpFilter implements Filter {
       

	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("sub1 프로젝트 시작");
		chain.doFilter(request, response);
		System.out.println("sub1 프로젝트 종료");

	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
