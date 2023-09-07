import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultantDAOImpl implements ConsultantDAO {
    private Connection connection;

 

	public ConsultantDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	public void ConsultantDAOImpl1() {
    	this.connection = connection;
	}
	@Override
    public List<Consultant> getAllConsultants() {
        List<Consultant> consultants = new ArrayList<>();
        String sql = "SELECT * FROM stlogin";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Consultant consultant = new Consultant();
                consultant.setId(resultSet.getString("id"));
                consultant.setfullname(resultSet.getString("fullname"));
                consultant.setmobilenumber(resultSet.getString("mobilenumber"));
                consultant.setEmail(resultSet.getString("email"));
                consultant.setUsername(resultSet.getString("username"));
                consultant.setpassword(resultSet.getString("password"));
                consultants.add(consultant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return consultants;
    }

    @Override
    public Consultant getConsultantById(String id) {
        String sql = "SELECT * FROM stlogin WHERE id=?";
        Consultant consultant = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    consultant = new Consultant();
                    consultant.setId(resultSet.getString("id"));
                    consultant.setfullname(resultSet.getString("fullname"));
                    consultant.setmobilenumber(resultSet.getString("mobilenumber"));
                    consultant.setEmail(resultSet.getString("email"));
                    consultant.setUsername(resultSet.getString("username"));
                    consultant.setpassword(resultSet.getString("password"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return consultant;
    }

    @Override
    public void addConsultant(Consultant consultant) {
        String sql = "INSERT INTO stlogin (id, fullname, mobilenumber, email, username, password) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, consultant.getId());
            preparedStatement.setString(2, consultant.getfullname());
            preparedStatement.setString(3, consultant.getmobilenumber());
            preparedStatement.setString(4, consultant.getEmail());
            preparedStatement.setString(5, consultant.getUsername());
            preparedStatement.setString(6, consultant.getpassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateConsultant(Consultant consultant) {
        String sql = "UPDATE stlogin SET fullname=?, mobilenumber=?, email=?, username=?, password=? WHERE id=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, consultant.getfullname());
            preparedStatement.setString(2, consultant.getmobilenumber());
            preparedStatement.setString(3, consultant.getEmail());
            preparedStatement.setString(4, consultant.getUsername());
            preparedStatement.setString(5, consultant.getpassword());
            preparedStatement.setInt(6, consultant.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteConsultant(String id) {
        String sql = "DELETE FROM stlogin WHERE id=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	@Override
	public void deleteConsultant(int consultantId) {
		// TODO Auto-generated method stub
		
	}
}
