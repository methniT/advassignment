import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
                String buttonClicked = request.getParameter("buttonClicked");

        if ("user123".equals(username) && "password123".equals(password)) {
            response.sendRedirect("menupage.jsp");
        } else if ("register".equals(buttonClicked)) {
            response.sendRedirect("registerpage.jsp");
        } else {
            response.sendRedirect("menupage.jsp");
        }
    }
        }