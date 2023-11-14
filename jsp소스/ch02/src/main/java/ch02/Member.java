package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String passWord = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] email = request.getParameterValues("email");
		String[] hobby = request.getParameterValues("hobby");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>" + "<br>");
		out.println("이름: " + name + "<br>");
		out.println("아이디: " + id + "<br>");
		out.println("암호: " + passWord + "<br>");
		out.println("성별: " + gender + "<br>");
		out.println("메일 수신여부: ");
		for (int i = 0; i < email.length; i++) {
			if (i == email.length - 1) {
				out.println(email[i] + "<br>");
			} else
				out.println(email[i] + ", ");
		}
		out.print("취미: ");
		for (int i = 0; i < hobby.length; i++) {
			if (i == hobby.length - 1) {
				out.println(hobby[i]);
			} else
				out.println(hobby[i] + ", ");
		}
		out.println("</body></html>");

		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
