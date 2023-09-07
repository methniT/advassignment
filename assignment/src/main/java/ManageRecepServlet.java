import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ManageRecepServlet")
public class ManageRecepServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String buttonValue = request.getParameter("button");

        if ("add".equals(buttonValue)) {

            response.sendRedirect("addreceptionist.jsp");
        } else if ("update".equals(buttonValue)) {

            response.sendRedirect("updatereceptionist.jsp");
        } else if ("delete".equals(buttonValue)) {

            response.sendRedirect("deletereceppage.jsp");
        }
    }
}
