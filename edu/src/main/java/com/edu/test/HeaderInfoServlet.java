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
		out.print("<head><title>Request ���� ��� Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>��û ��� ����</h3>");
		Enumeration<String> em = req.getHeaderNames(); // getHeaderNames �޼��忡�� ���� ������ string������ Enu-��ü�� ����
		while (em.hasMoreElements()) { // em�� ����Ű�� Enumeration��ü Ŀ�� ������ �����Ͱ� �ִ��� �������� boolean���� ��ȯ
			String s = em.nextElement(); // Ŀ���� ���� ��ҷ� �̵���Ŵ
			out.println(s + " : " + req.getHeader(s) + "<br/>");
		}
		out.print("</body></html>");
		out.close();
	}

}
