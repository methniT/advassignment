import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/advdb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user input from the form
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String id = request.getParameter("id");

        // Initialize the database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Insert user data into the database
            String insertQuery = "INSERT INTO login (email, username, password,id) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, id);
            preparedStatement.executeUpdate();

            // Close resources
            preparedStatement.close();
            connection.close();

            // Redirect to a success page
            response.sendRedirect("loginpage.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle database errors and redirect to an error page if needed
            response.sendRedirect("loginpage.jsp");
        }
    }
}
