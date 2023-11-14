package ch15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/sub3/*")
public class LogFilter extends HttpFilter implements Filter {
	private PrintWriter pw;

	public void init(FilterConfig fConfig) throws ServletException {
		try {
			pw = new PrintWriter(new FileWriter("C:/jsp/filterLog.txt"));
		} catch (IOException e) {}
	}

	public void destroy() {
		if(pw != null) pw.close();
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		GregorianCalendar gc = new GregorianCalendar();
		String date = String.format("%TF %TT",gc,gc);
		pw.write(date+": sub3폴더 작업 실행\r\n");
		chain.doFilter(request, response);
	}

}
