import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NumberofRows {

	// 1.no of rows in player table
	public static void numberOfElementsinPlayer() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root",
					"9396334879");
			String sql = "select max(player_id) from player";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			int numberOfElements = 0;
			while (rs.next()) {
				numberOfElements = rs.getInt(1);
			}
			System.out.println("no of rows in matches table:" + numberOfElements);
			rs.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 2.finding number of rows in matches table

	public static void numberofElementsinMatches()

	{
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root",
					"9396334879");
			String sql = "Select max(id) from matches";
			int noofrows = 0;
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				noofrows = rs.getInt(1);
			}
			System.out.println("no of rows in matches table:" + noofrows);
			rs.close();
			ps.close();
			conn.close();

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		numberOfElementsinPlayer();
		numberofElementsinMatches();
	}

}
