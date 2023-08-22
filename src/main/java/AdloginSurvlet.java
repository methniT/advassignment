

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdloginSurvlet
 */
@WebServlet("/AdloginSurvlet")
public class AdloginSurvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            String query = "SELECT * FROM stafflogin WHERE id = '"+id+"'AND username='"+username+"' AND password='"+password+"'";
            ps = conn.prepareStatement(query);
            ps.setString(1, id);            
            ps.setString(2, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("menupage.jsp");
            } else {
                response.sendRedirect("menupage.jsp?error=1");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            
            response.sendRedirect("adminloginpage.jsp?error=2");
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
