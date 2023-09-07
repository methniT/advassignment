
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StaffLoginServlet")
public class StaffLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    	try {

        	response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advdb ","root","root");
			
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	        PreparedStatement ps1 = con.prepareStatement("select username from stlogin where username = ? and password = ?");
	        ps1.setString(1,username);
	        ps1.setString(2, password);
	        ResultSet rs = ps1.executeQuery();
	        
	        if(rs.next())
	        {
	        	RequestDispatcher rd1 = request.getRequestDispatcher("homestaff.jsp");
	        	rd1.forward(request, response);
	        }
	        else
	        {
	        	response.sendRedirect("staffloginpage.jsp?error");
	        }
	        
	        
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		};
	}
}