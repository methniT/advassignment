import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AppointmentServlet")
public class AppointmentServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String buttonValue = request.getParameter("button");

        if ("add".equals(buttonValue)) {
            // Redirect to Page1.jsp when Button 1 is clicked
            response.sendRedirect("add_appointment.jsp");
        } else if ("cancel".equals(buttonValue)) {
            // Redirect to Page2.jsp when Button 2 is clicked
            response.sendRedirect("cancelappointment.jsp");
        }
    }
}
