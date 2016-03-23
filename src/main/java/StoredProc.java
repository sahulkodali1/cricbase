

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProc {
	public static void getCustomer(int customerId)
	{
		
	try {
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root", "9396334879");
		
	String st="call fetchPlayer(?)";
	CallableStatement cst=conn.prepareCall(st);
	cst.setInt(1, customerId);

	ResultSet rs=cst.executeQuery();
	while(rs.next())
	{
	System.out.println(rs.getString("name"));	
	System.out.println(rs.getString("street"));				
	System.out.println(rs.getString("city"));				//problem:collumn state and country are not detected
	System.out.println(rs.getString("country"));
	System.out.println("state");
	}
	rs.close();
	cst.close();
	conn.close();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	public static void main(String[] args) {
		getCustomer(23);

	}

}