package com.azienda.progetto.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.azienda.progetto.utils.Costanti;

@WebServlet("/quar")
public class QuartaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//vado a leggere dalla sessione e anziché scriverlo a mano, con possibilità di errori, me lo prendo dalla mia classe Costanti
		//quindi se ti interessa fai il cast col tipo che vuoi
		//quando abbiamo fatto la setAttribute il valore era s che è una stringa, con la getAttribute possiamo fare il cast a stringa
		String a = (String) req.getSession().getAttribute(Costanti.CHIAVE_SESSIONE);
		System.out.println("L'oggetto in sessione è " + a);
		
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<h3>Oggetto in sessione: " + a + "</h3>");
		printWriter.flush();
		printWriter.close();
	}

}
