import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.DBConnection;

@WebServlet("/UpdateRecepServlet")
public class UpdateRecepServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String inputId = request.getParameter("receptionistId");
        String fullname = request.getParameter("fullname");
        String mobilenumber = request.getParameter("mobilenumber");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {

            if (inputId != null && !inputId.isEmpty()) {
                int receptionistId = Integer.parseInt(inputId);

                Connection connection = DBConnection.getConnection();


                ReceptionistDAO ReceptionistDAO = new ReceptionistDAOImpl();


                Receptionist updateReceptionist = new Receptionist();
                updateReceptionist.setId1(receptionistId);
                updateReceptionist.setfullname(fullname); 
                updateReceptionist.setfullname(mobilenumber); 
                updateReceptionist.setfullname(email); 
                updateReceptionist.setfullname(username); 
                updateReceptionist.setfullname(password); 

                ReceptionistDAO.updatereceptionist(updateReceptionist);

                connection.close();

                response.sendRedirect("homestaff.jsp");
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
