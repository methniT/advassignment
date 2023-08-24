
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

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	try {

        	response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advdb ","root","root");
			
	        String fullname = request.getParameter("fullname");
	        String mobilenumber = request.getParameter("mobilenumber");
	        String email = request.getParameter("email");
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	        PreparedStatement ps = con.prepareStatement("insert into advdb  login where username = ? and password = ?");
	        ps.setString(1,fullname);
	        ps.setString(2, mobilenumber);
	        ps.setString(3, email);
	        ps.setString(4, username);
	        ps.setString(5, password);
	        ResultSet rs = ps.executeQuery();
	        
	        if(rs.next())
	        {
	        	RequestDispatcher rd = request.getRequestDispatcher("menupage.jsp");
	        	rd.forward(request, response);
	        }
	        else
	        {
	        	response.sendRedirect("loginpage.jsp?status");
	        }
	        
	        
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		};
	}
}
    	



