import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GettingData {
	//1.getting data from player database
	public static void PlayerData()
	{
	try
	{
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root","9396334879");
		String sql="SELECT * FROM sahuldatabse.player";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
		System.out.println(rs.getInt("player_id"));
		System.out.println(rs.getInt("age"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("role"));
		System.out.println(rs.getString("nationality"));
		
		}
		System.out.println("\n--------------------------------");
		rs.close();
		ps.close();
		conn.close();
		
	
	}
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
//2.getting data from match table	
	public static void matchesData()
	{
	try
	{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root","9396334879");
		String sql="SELECT * FROM sahuldatabse.matches";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getInt("testmatch"));
			System.out.println(rs.getInt("odi"));
			System.out.println(rs.getInt("t20"));
			System.out.println(rs.getInt("player_id"));
			
		}
		rs.close();
		ps.close();
		conn.close();
	} 
	catch (SQLException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

	public static void main(String[] args) {
		GettingData.PlayerData();
		GettingData.matchesData();

	}

}
