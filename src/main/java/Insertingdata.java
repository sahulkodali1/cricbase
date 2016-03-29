import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import tables.Player;

public class Insertingdata {
	
	public static void maxId()
	{
		
		try {
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root",
					"9396334879");
			int maxId=0;
			String sql1 = "SELECT MAX(player_id) FROM player";
			PreparedStatement pst1 = conn.prepareStatement(sql1);
			ResultSet rs=pst1.executeQuery();
			while(rs.next()){
				 maxId = rs.getInt(1);
				}
			System.out.println("the nextid for the feild would be "+(maxId+1));
rs.close();
pst1.close();
conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	public static void insetingDatabyAdmin(Player p) {
		try {

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root",
					"9396334879");

			
			String sql = "insert into player(player_id,name,age,role,nationality) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, p.getPlayer_id());
			pst.setString(2, p.getName());
			pst.setInt(3, p.getAge());
			pst.setString(4, p.getRole());
			pst.setString(5, p.getNationality());

			int roweffected = pst.executeUpdate();
			System.out.println("no of rows effected are:"+roweffected);
			
			
			pst.close();
			conn.close();

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args)
	{
		Insertingdata.maxId();
		Scanner scan = new Scanner(System.in);
		System.out.print("how many members you want to add to table: ");
		int choice = scan.nextInt();
		for (int i = 1; i <= choice; i++) {
			Player p1 = new Player();

			System.out.print("please do enter the player id:");
			int id = scan.nextInt();
			p1.setPlayer_id(id);

			System.out.print("please do enter the player name:");
			String name = scan.next();
			p1.setName(name);

			System.out.print("please do enter the player age:");
			int age = scan.nextInt();
			p1.setAge(age);

			System.out.print("please do enter the player role:");
			String role = scan.next();
			p1.setRole(role);

			System.out.print("please do enter the nationality of the player:");
			String nationality = scan.next();
			p1.setNationality(role);

			insetingDatabyAdmin(p1);
		}

			
	}
}

	
