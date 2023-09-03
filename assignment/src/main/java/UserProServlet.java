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

@WebServlet("/UserProServlet")
public class UserProServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId;
        try {
            userId = Integer.parseInt(request.getParameter("id"));
        } catch (NumberFormatException e) {
            response.sendRedirect("error.jsp"); // Invalid user ID
            return;
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/advdb";
        String dbUsername = "root";
        String dbPassword = "root";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
            String query = "SELECT * FROM login WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String email = resultSet.getString("email");
                String username = resultSet.getString("username");

                // You can retrieve other user information here
                request.setAttribute("email", email);
                request.setAttribute("username", username);

                // Set other attributes for user details

                request.getRequestDispatcher("userprofilepage.jsp").forward(request, response);
            } else {
                response.sendRedirect("error.jsp"); // User not found
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp"); // Database error
        }
    }
}
