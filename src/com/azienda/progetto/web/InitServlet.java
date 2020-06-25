package com.azienda.progetto.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


import com.azienda.progetto.model.TestBean;
import com.azienda.progetto.utils.Costanti;

@WebServlet(value="/iS",loadOnStartup = 1)
public class InitServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		TestBean obj = new TestBean("Ciao");
		getServletContext().setAttribute(Costanti.CHIAVE_SERVLET_CONTEXT, obj);
		
	}

}
