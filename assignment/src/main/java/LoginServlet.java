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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {

        	response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advdb ","root","root");
			
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	        PreparedStatement ps = con.prepareStatement("select username from login where username = ? and password = ?");
	        ps.setString(1,username);
	        ps.setString(2, password);
	        ResultSet rs = ps.executeQuery();
	        
	        if(rs.next())
	        {
	        	RequestDispatcher rd = request.getRequestDispatcher("menupage.jsp");
	        	rd.forward(request, response);
	        }
	        else
	        {
	        	response.sendRedirect("loginpage.jsp?error");
	        }
	        
	        
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		};
	}
}
        
       