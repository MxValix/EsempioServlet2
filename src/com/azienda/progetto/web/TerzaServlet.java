package com.azienda.progetto.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.azienda.progetto.utils.Costanti;

@WebServlet("/ter")
public class TerzaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s = req.getParameter("pluto");
		System.out.println("L'utente ha digitato " + s);
		//dobbiamo fare attenzione al fatto che setAttribute vuole una stringa che nel nostro caso è la costante e un valore che è un oggetto
		//la sessione è una mappa che vuole come chiave una stringa e come valore un oggetto
		//dalla request mi prendo la session e gli passo la chiave che per comodità ho messo in una costante
		//come valore gli do quello che l'utente mi ha dato nell'html
		req.getSession().setAttribute(Costanti.CHIAVE_SESSIONE, s);

		req.getRequestDispatcher("/html/rispostaSeconda.html").forward(req, resp);

	}

}
