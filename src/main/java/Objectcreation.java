import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tables.Player;

public class Objectcreation {
	public static Connection getmeaConnection() throws SQLException
	{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root","9396334879");
		return conn;
		
	}
	
public static List<Player> getMePlayerData(){
	List<Player>playerdata=new ArrayList<>();
	try
	{
	Connection conn=getmeaConnection();
	String sql="select name,age from sahuldatabse.player ";
	PreparedStatement pst=conn.prepareStatement(sql);
	
	ResultSet rs=pst.executeQuery(sql);
	while(rs.next())
	{
	
		Player player=new Player();
		player.setName(rs.getString("name"));
		player.setAge(rs.getInt("age"));
		playerdata.add(player);
	
	}
	
	rs.close();
	pst.close();
	conn.close();
	
	}
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return playerdata;
	
}

	public static void main(String[] args) 
	{
		List<Player> plyer=getMePlayerData();
		plyer.forEach(Player ->System.out.println(Player.getName()));

	}

}
