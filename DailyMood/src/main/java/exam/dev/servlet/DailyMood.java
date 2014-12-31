package exam.dev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DailyMood extends HttpServlet {

	private static final long serialVersionUID = -1623573968810638828L;

	@Override
	public void init() throws ServletException {
		// TODO log here
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		 PrintWriter out = resp.getWriter();
	     out.println("<h1> Tuan </h1>");
	}
}
