import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddAppointmentServlet")
public class AddAppointmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/advdb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String consultant = request.getParameter("consultant");


        if (!isValidDateFormat(date)) {
        
            response.sendRedirect("error.jsp");
            return;
        }


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {

                String insertQuery = "INSERT INTO appointments (id, date, time, consultant) VALUES (?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    preparedStatement.setString(1, id);
                    preparedStatement.setString(2, date);
                    preparedStatement.setString(3, time);
                    preparedStatement.setString(4, consultant);
                    preparedStatement.executeUpdate();
                }
            }


            response.sendRedirect("home.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

            response.sendRedirect("error.jsp");
        }
    }


    private boolean isValidDateFormat(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
