import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ManageApServlet")
public class ManageApServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String buttonValue = request.getParameter("button");

        if ("add".equals(buttonValue)) {

            response.sendRedirect("add_appointment.jsp");
        } else if ("cancel".equals(buttonValue)) {

            response.sendRedirect("cancelappointment.jsp");
        }
    }
}
