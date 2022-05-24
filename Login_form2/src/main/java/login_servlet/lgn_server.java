package login_servlet;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login_bean.bean;
import login_dao.dao;

public class lgn_server extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private dao dao1;
	
	public void init() {
		dao1 = new dao();
	}
	
	protected void doPost(HttpServletRequest req , HttpServletResponse res)throws ServletException , IOException {
		boolean result =false;
			String username = req.getParameter("username");
			String passsword = req.getParameter("password");
			
			bean bn = new bean();
			bn.setUsername(username);
			bn.setPassword(passsword);
			
			try {
				result = dao1.valid(bn);
				if(result == true)
				{
					RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
					rd.include(req , res);
				}
				else {
					req.setAttribute("NOTIFICATION" , "Invalid Creds Try Again!");
					RequestDispatcher rd = req.getRequestDispatcher("login_form.jsp");
					rd.forward(req , res);
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
		
	}

}
