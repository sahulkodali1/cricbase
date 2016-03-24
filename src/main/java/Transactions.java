import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

public class Transactions {
	
	public static Connection getMeConnection() throws SQLException,
	ClassNotFoundException {
String url = "jdbc:mysql://localhost:3306/sahuldatabse";
String user = "root";
String pwd = "9396334879";

// Trying to register the driver

System.out.println("trying to register driver");
Class.forName("com.mysql.jdbc.Driver");
System.out.println("registered drive succesfully");
Connection conn = DriverManager.getConnection(url, user, pwd);
return conn;

}


// Try to connect to the database with the given url and login details
public static void main(String[] args) {
try {
	Connection conn = getMeConnection();
	conn.setAutoCommit(false);
	Savepoint sp=conn.setSavepoint();
	String sql = "update sahuldatabse.player set name='bhuvi' where player_id='2'";
	Statement stmt = conn.createStatement();
	stmt.executeUpdate(sql);
	String sql1 = "update sahuldatabse.matches set testmatch='230' where id='1'";
	Statement stmt1 = conn.createStatement();
	stmt1.execute(sql1);
	int userResponse = commitOrNot();
	if(userResponse==1)
	{
		System.out.println("Commiting..");
		conn.commit();
	}
	if(userResponse==2)
	{
		System.out.println("Rollback in progress..");
		conn.rollback(sp);
	}
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}

}


private static int commitOrNot() {
System.out.println("Enter 1.Commit 2.Rollback");
int response;
Scanner sc = new Scanner(System.in);
response=sc.nextInt();
return response;
}
}


	


