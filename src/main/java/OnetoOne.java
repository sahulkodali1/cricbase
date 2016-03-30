
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tables.Matches;
import tables.Player;

public class OnetoOne {
	public static Player OnetoOne(int id) {
		Player p1 = new Player();
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root",
					"9396334879");
			String sql = "select p.name,p.age,p.nationality,p1.testmatch,p1.odi from sahuldatabse.player p join sahuldatabse.matches p1 on p.player_id=p1.player_id where p.player_id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				// System.out.println(rs.getString("street"));
				// System.out.println(rs.getString("city"));
				Matches m = new Matches();
				m.setTestmatches(rs.getInt("testmatch"));
				m.setOdi(rs.getInt("odi"));
				p1.setMatches(m);

			}
			rs.close();
			pst.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p1;
	}

	public static void main(String[] args) {
		Player customer = OnetoOne(1);
		System.out.println(customer.getName());
		System.out.println(customer.getMatches().getTestmatches());
		System.out.println(customer.getMatches().getOdi());
	}

}
