import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.DBConnection;

@WebServlet("/DeleteConServlet")
public class DeleteConServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String inputId = request.getParameter("consultantId");

        try {

            if (inputId != null && !inputId.isEmpty()) {
                int consultantId = Integer.parseInt(inputId);
                Connection connection = DBConnection.getConnection();

                ConsultantDAO consultantDAO = new ConsultantDAOImpl();

                consultantDAO.deleteConsultant(consultantId);

                connection.close();

                response.sendRedirect("homeadmin.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }
        } catch (NumberFormatException e) {
            response.sendRedirect("error.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp"); 
        }
    }
}
