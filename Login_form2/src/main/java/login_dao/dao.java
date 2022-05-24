package login_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import login_bean.bean;

public class dao {
	
		String URL="jdbc:mysql://localhost:3306/lgn_crds";
		String User="root";
		String Pass="Password";
		
		public boolean valid(bean bn)throws ClassNotFoundException {
			String SQL="select * from creds where username = ? and password = ?";
			boolean status=false;
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(URL,User,Pass);
				PreparedStatement ps = con.prepareStatement(SQL);
				{
					ps.setString(1,bn.getUsername());
					ps.setString(2, bn.getPassword());
				}
				ResultSet rs = ps.executeQuery();
				status=rs.next();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}
}
