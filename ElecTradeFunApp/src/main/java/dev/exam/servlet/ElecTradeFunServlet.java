package dev.exam.servlet;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ElecTradeFunServlet extends HttpServlet {

	private static final long serialVersionUID = 5106959130342616826L;

	private static final String MODULE_NAME = "ElecTradeFunService-1.0-SNAPSHOT";
	private static final String REMOTE_BEAN_NAME = "ElectTradeFunService";
			
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		handleRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		handleRequest(req, resp);
	}
	
	private void handleRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Context context = null;
		
	}
	
	
}
