package Atul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws  SQLException, Exception {
			
		adactinpage obj = new adactinpage();
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("jdbc loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kiru","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from login");
		rs.next();
		
		for (int i = 0; i < 3; i++) {
		String un1 = rs.getString(1);
		String pwd1 = rs.getString(2);
		System.out.println(un1 + " " + pwd1);
		rs.next();
		obj.launchapp();
		obj.login(un1, pwd1);
		obj.logout();
		
	}

}
}
