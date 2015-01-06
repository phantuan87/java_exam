package dev.exam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This servlet handles all errors of Back-end.
 * 
 * @author phantuan
 *
 */
public class ErrorHandler extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private static final String CLIENT_MSG = "Oops! Something went wrong!";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doErrorHandler(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doErrorHandler(req, resp);
	}
	
	private void doErrorHandler(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Throwable throwable = (Throwable) req.getAttribute("javax.servlet.error.exception");
		String servletName = (String) req.getAttribute("javax.servlet.error.servlet_name");
		if (servletName == null) {
			servletName = "Unknown";
		}

		getServletContext().log("Servlet " + servletName
				+ " has thrown an exception " + throwable.getClass().getName()
				+ " : " + throwable.getMessage());
		
		req.setAttribute("msg", CLIENT_MSG);
		req.getRequestDispatcher("/error.jsp").forward(req, resp);
	}
}
