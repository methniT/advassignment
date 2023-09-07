import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.DBConnection;

@WebServlet("/UpdateConServlet")
public class UpdateConServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve input parameters for updating
        String inputId = request.getParameter("consultantId");
        String fullname = request.getParameter("fullname");
        String mobilenumber = request.getParameter("mobilenumber");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            if (inputId != null && !inputId.isEmpty()) {
                int consultantId = Integer.parseInt(inputId);

                Connection connection = DBConnection.getConnection();

                ConsultantDAO consultantDAO = new ConsultantDAOImpl();


                Consultant updatedConsultant = new Consultant();
                updatedConsultant.setId(consultantId);
                updatedConsultant.setfullname(fullname); 
                updatedConsultant.setfullname(mobilenumber); 
                updatedConsultant.setfullname(email); 
                updatedConsultant.setfullname(username); 
                updatedConsultant.setfullname(password); 

                consultantDAO.updateConsultant(updatedConsultant);

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
