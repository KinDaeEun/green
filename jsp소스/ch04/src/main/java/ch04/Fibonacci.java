package ch04;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Fibonacci")
public class Fibonacci extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BigInteger arr[];// long보다 더 큰 정수를 담는 클래스
	//init메서드 서블릿에서 맨 처음에 실행 메서드, doGet/doPost보다 먼저 실행
	public void init() throws ServletException {
		arr = new BigInteger[100];
		arr[0]= new BigInteger("1");
		arr[1]= new BigInteger("1");
		for(int i=2;i<arr.length;i++) { //f(n) = f(n-1)+f(n-2)
			arr[i] = arr[i-2].add(arr[i-1]);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>피보나찌 수열</h2>");
		for(int i = 0;i<num;i++) {
			out.println(arr[i]+"<p>");
		}
		out.println("</body></html>");
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
