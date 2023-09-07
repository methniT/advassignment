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

@WebServlet("/ViewAppointmentsServlet")
public class ViewAppointmentsServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;

        try {
            // Register the JDBC driver (you should do this once in your application)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection to the database
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Prepare a SQL query to retrieve user data based on the provided ID
            String userId = request.getParameter("id");
            String sql = "SELECT date, time, consultant FROM appointments WHERE id = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, userId);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a user with the given ID exists
            if (resultSet.next()) {

                String Apdate = resultSet.getString("date");
                String Aptime = resultSet.getString("time");
                String Consultant = resultSet.getString("consultant");


                request.setAttribute("date", Apdate);
                request.setAttribute("time", Aptime);
                request.setAttribute("consultant", Consultant);
            } else {

                request.setAttribute("error", "Not found");
            }


            request.getRequestDispatcher("/viewappointmentpage.jsp").forward(request, response);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle database connection errors
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
