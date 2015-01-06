package dev.exam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.exam.bean.ElectTradeFunServiceRemote;
import dev.exam.utils.ClientUtil;

public class ElecTradeFunServlet extends HttpServlet {

	private static final long serialVersionUID = 5106959130342616826L;

	private static final String MODULE_NAME = "ElecTradeFunService-1.0-SNAPSHOT";
	private static final String REMOTE_BEAN_NAME = "ElectTradeFunService";
	private static final String INTERFACE_NAME = "dev.exam.bean.ElectTradeFunServiceRemote";
			
	
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
		ElectTradeFunServiceRemote remoteBean = null;
		
		try {
			context = ClientUtil.getInitialContext();
			String lookupName = ClientUtil.getLookupName("", MODULE_NAME, "", REMOTE_BEAN_NAME, INTERFACE_NAME);
			remoteBean = (ElectTradeFunServiceRemote) context.lookup(lookupName);
			
			// Call EFT service to get all trades
			List<String> allTrades = remoteBean.getAllTrades();
			
			PrintWriter out = resp.getWriter();
		    out.println("<h1> All trades </h1>");
		    
		    for (String trade : allTrades) {
		    	out.println(trade + "</br>");
			}
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
