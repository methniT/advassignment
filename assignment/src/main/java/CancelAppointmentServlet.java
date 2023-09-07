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

@WebServlet("/CancelAppointmentServlet")
public class CancelAppointmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/advdb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the appointment ID to be canceled from the form
        String Id = request.getParameter("Id");

        // Validate the input data (e.g., check if the appointment ID is valid)

        // Initialize the database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                // Perform the cancellation by deleting the appointment
                String deleteQuery = "DELETE FROM appointments WHERE id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                    preparedStatement.setString(1, Id);
                    int rowsAffected = preparedStatement.executeUpdate();

                    // Check if any rows were affected to confirm the appointment was canceled
                    if (rowsAffected > 0) {
                        // Redirect to a success page or display a success message
                        response.sendRedirect("home.jsp");
                    } else {
                        // Redirect to an error page or display an error message
                        response.sendRedirect("cancelappointment.jsp");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Log the exception and provide an error message to the user
            response.sendRedirect("error.jsp");
        }
    }
}
