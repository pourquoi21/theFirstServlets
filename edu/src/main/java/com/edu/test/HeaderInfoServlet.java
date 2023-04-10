package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException {
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		Enumeration<String> em = req.getHeaderNames(); // getHeaderNames 메서드에서 얻은 응답중 string형식을 Enu-객체로 만듦
		while (em.hasMoreElements()) { // em이 가리키는 Enumeration객체 커서 다음에 데이터가 있는지 없는지를 boolean으로 반환
			String s = em.nextElement(); // 커서를 다음 요소로 이동시킴
			out.println(s + " : " + req.getHeader(s) + "<br/>");
		}
		out.print("</body></html>");
		out.close();
	}

}
