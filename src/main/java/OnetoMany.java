
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tables.Player;
import tables.Playerstatus;
import tables.PresentStatus;

public class OnetoMany {

	public static Player getPlayerStatus(int id) {
		Player player = new Player();

		try {
			List<PresentStatus> ps = new ArrayList<>();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root",
					"9396334879");
			String sql = "select p.name,ps.playerstatus,ps.idstatus from sahuldatabse.player p join sahuldatabse.status ps on p.player_id=ps.player_id where p.player_id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				player.setName(rs.getString("name"));
				PresentStatus ps1 = new PresentStatus();

				ps1.setStatus(Playerstatus.valueOf(rs.getString("playerstatus")));
				ps.add(ps1);
			}
			player.setStatus1(ps);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return player;

	}

	public static void main(String[] args) {
		Player p = getPlayerStatus(1);
		System.out.println(p.getName());
		p.getStatus1().forEach(ps -> System.out.println(ps.getStatus()));

	}

}
