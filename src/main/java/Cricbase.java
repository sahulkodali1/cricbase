import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tables.Player;

public class Cricbase {

	public static void getPlayerData() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root",
					"9396334879");
			Statement st = conn.createStatement();
			String sql = "select * from sahuldatabse.player ";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println("the player with the given id is " + rs.getString("name") + " from "
						+ rs.getString("nationality") + " who plays as " + rs.getString("role"));
			}
			rs.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Cricbase.getPlayerData();

	}

}
