package com.revature.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HelloServlet extends HttpServlet{
	
	private static final Logger log = LogManager.getLogger(HelloServlet.class);
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		log.warn("Someone is saying hi.");
		PrintWriter pw = res.getWriter();
		pw.print("<h1> Hello from your doGet method; I'm on Jenkins</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.print("<h1> Hello from your doPost method</h1>");
	}

}
