package HW.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import 	jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/home","/trangchu"})
public class HomeServlet extends HttpServlet{

	private static final long serialVersionUID = -7732137693015205906L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter printW = resp.getWriter();
		printW.println("<h1>NguyenQuocTuan22110261</h1>");
		printW.close();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
}