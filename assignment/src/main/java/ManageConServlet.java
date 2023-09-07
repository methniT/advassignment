import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ManageConServlet")
public class ManageConServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String buttonValue = request.getParameter("button");

        if ("add".equals(buttonValue)) {

            response.sendRedirect("addconsultant.jsp");
        }  else if ("update".equals(buttonValue)) {

                response.sendRedirect("updateconsultant.jsp");
            
        } else if ("delete".equals(buttonValue)) {

            response.sendRedirect("deleteconsultant.jsp");
        }
    }
}
