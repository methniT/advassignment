import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register {
	private String dburl = "jdbc:mysql://localhost:3306/advdb";
	private String dbuser = "root";
	private String dbpword = "root";
	private String dbdriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbdriver)
	{
	try {
		Class.forName(dbdriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(dburl,dbuser,dbpword);
		} catch (SQLException e) {
			e.spliterator();
		}
		return con;
	}
	
	public String insert(user user)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "Successfully registered";
		
		String sql = "insert into databasead.user values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,user.getEmail());
			ps.setString(2,user.getUsername());
			ps.setString(3,user.getPassword());
			
		} catch (SQLException e) {

			e.printStackTrace();
			result = "Error Occured";
			
		}
		return result;
	
	}
}
