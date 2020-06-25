package com.azienda.progetto.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimoEsempioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s = req.getParameter("nome");
		String serverName = req.getServerName();
		Integer serverPort = req.getServerPort();
		String servletPath = req.getServletPath();
		String contextPath = req.getServletContext().getContextPath();
		
		resp.setContentType("text/html");
		PrintWriter  printWriter = resp.getWriter();
		printWriter.println("<h3>Hai digitato " + s + "</h3>");
		printWriter.println("<h3>Server name:" + serverName + "</h3>");
		printWriter.println("<h3>Server port:" + serverPort + "</h3>");
		printWriter.println("<h3>Servlet path:" + servletPath + "</h3>");
		printWriter.println("<h3>Context path:" + contextPath + "</h3>");
		printWriter.flush();
		printWriter.close();
	}
	
}
