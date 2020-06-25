package com.azienda.progetto.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.azienda.progetto.utils.Costanti;


@WebFilter("/html/areaRiservata/*")
public class TestFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String s = (String) httpRequest.getSession().getAttribute(Costanti.CHIAVE_SESSIONE);
		String path = "/html/";
		if (s == null) {
			path += "/paginaNegata.html";
			httpRequest.getRequestDispatcher(path).forward(httpRequest,response);
		}
		else {
			chain.doFilter(httpRequest, response);
		}
		
	}
	
}
