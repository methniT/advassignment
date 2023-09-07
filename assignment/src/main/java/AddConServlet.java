import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yourpackage.DatabaseUtil;

@WebServlet("/AddConServlet")
public class AddConServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String id = request.getParameter("id");
        String fullname = request.getParameter("fullname");
        String mobilenumber = request.getParameter("mobilenumber");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (fullname != null && email != null) {
            try (Connection conn = DatabaseUtil.getConnection();
                 PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO stlogin (id, fullname, mobilenumber, email, username, password) VALUES (?, ?, ?, ?, ?, ?)")) {
            	preparedStatement.setString(1, id);
            	preparedStatement.setString(2, fullname);
            	preparedStatement.setString(3, mobilenumber);
            	preparedStatement.setString(4, email);
            	preparedStatement.setString(5, username);
                preparedStatement.setString(6, password);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        response.sendRedirect("manageconpage.jsp");
    }
}
