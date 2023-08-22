import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");        
        String fullname = request.getParameter("fullname");
        String mobilenumber = request.getParameter("mobilenumber");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advdb", "root", "root");


            PreparedStatement statement = con.prepareStatement("insert into register values(?)");
            statement.setString(1, id);
            statement.setString(2, fullname);
            statement.setString(3, mobilenumber);
            statement.setString(4, email);
            statement.setString(5, username);
            statement.setString(6, password);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response.sendRedirect("menupage.jsp");
            }

        } catch (Exception e) {
           
                response.sendRedirect("loginpage.jsp");
        }
    }
}


