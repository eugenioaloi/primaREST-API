package src.connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connesione {
	
	public static ResultSet connettiDb(String query) throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/provautenti";
		String user = "root";
		String psw = "password";
		
		Connection con = DriverManager.getConnection(url,user,psw);
		Statement st = con.createStatement();
			
		ResultSet rs = st.executeQuery(query);
		
		return rs;
	}

}
