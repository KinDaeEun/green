package ch04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Adder")
public class Adder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>사칙연산</h2>");
		try {
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			out.printf("%d+%d=%d<p>",num1,num2,num1+num2);
			out.printf("%d-%d=%d<p>",num1,num2,num1-num2);
			out.printf("%d*%d=%d<p>",num1,num2,num1*num2);
			out.printf("%d/%d=%d<p>",num1,num2,num1/num2);
		}catch(Exception e) {
			out.print("0으로 나눌 수 없습니다");
		}
		out.println("</html></body>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
