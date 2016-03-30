
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction {
	public static void main(String[] args) {
		transactions();
	}

	public static void transactions() {
		try {
			Connection myconn = getConnection();
			myconn.setAutoCommit(false);
			String sql = ("insert into player(player_id,name,age,role,nationality) values (9,zaheer,34,bowler,indian)");
			String sql1 = ("update sahuldatabse.player set age = 21 where name = 'hardikpandya'");
			Statement stmt = myconn.createStatement();
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql1);
			boolean ok = savePoint();
			if (ok) {
				myconn.commit();
				System.out.println("Transaction done");
			} else {
				myconn.rollback();
				System.out.println("rolled back");
			}
			myconn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static boolean savePoint() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Is it okay to save?  yes/no: ");
		String input = scan.nextLine();

		scan.close();

		return input.equalsIgnoreCase("yes");
	}

	private static Connection getConnection() throws SQLException {
		Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahuldatabse", "root",
				"9396334879");
		return myconn;
	}
}
