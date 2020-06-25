package com.azienda.progetto.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.azienda.progetto.utils.Costanti;


// @WebServlet("/sett")
public class SettimaServletOld extends HttpServlet {
  /*
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String y = req.getParameter("bbb");
		System.out.println("Settima servlet, utente: " + y);
		
		String attr = (String)req.getAttribute(Costanti.CHIAVE_REQUEST);
		String type = "text/html";		
		String divAttr = "<div style=\"text-align:center\">Attribute: " + attr + "</div>";

		resp.setContentType(type);
		PrintWriter printWriter = resp.getWriter();
		printWriter.println(divAttr);
		printWriter.flush();
		printWriter.close();

	}
	*/

}
