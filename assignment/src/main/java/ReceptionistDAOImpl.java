import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReceptionistDAOImpl implements ReceptionistDAO {
    private Connection connection;

 

	public ReceptionistDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	public void ConsultantDAOImpl1() {
    	this.connection = connection;
	}
	@Override
    public List<Receptionist> getAllReceptionists() {
        List<Receptionist> Receptionist = new ArrayList<>();
        String sql = "SELECT * FROM stlogin";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
            	Receptionist receptionist = new Receptionist();
            	receptionist.setId(resultSet.getString("id"));
            	receptionist.setfullname(resultSet.getString("fullname"));
            	receptionist.setmobilenumber(resultSet.getString("mobilenumber"));
            	receptionist.setEmail(resultSet.getString("email"));
            	receptionist.setUsername(resultSet.getString("username"));
            	receptionist.setpassword(resultSet.getString("password"));
            	receptionist.add(receptionist);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Receptionist;
    }

    public Receptionist getReceptionistById1(String id) {
        String sql = "SELECT * FROM stlogin WHERE id=?";
        Receptionist receptionist = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                	receptionist = new Receptionist();
                	receptionist.setId(resultSet.getString("id"));
                	receptionist.setfullname(resultSet.getString("fullname"));
                	receptionist.setmobilenumber(resultSet.getString("mobilenumber"));
                	receptionist.setEmail(resultSet.getString("email"));
                	receptionist.setUsername(resultSet.getString("username"));
                	receptionist.setpassword(resultSet.getString("password"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return receptionist;
    }

    public void addreceptionist11(Receptionist receptionist) {
        String sql = "INSERT INTO stlogin (id, fullname, mobilenumber, email, username, password) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, receptionist.getId());
            preparedStatement.setString(2, receptionist.getfullname());
            preparedStatement.setString(3, receptionist.getmobilenumber());
            preparedStatement.setString(4, receptionist.getEmail());
            preparedStatement.setString(5, receptionist.getUsername());
            preparedStatement.setString(6, receptionist.getpassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatereceptionist1(Receptionist receptionist) {
        String sql = "UPDATE stlogin SET fullname=?, mobilenumber=?, email=?, username=?, password=? WHERE id=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, receptionist.getfullname());
            preparedStatement.setString(2, receptionist.getmobilenumber());
            preparedStatement.setString(3, receptionist.getEmail());
            preparedStatement.setString(4, receptionist.getUsername());
            preparedStatement.setString(5, receptionist.getpassword());
            preparedStatement.setInt(6, receptionist.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletereceptionist(String id) {
        String sql = "DELETE FROM stlogin WHERE id=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public void deletereceptionist1(int receptionistId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Receptionist getReceptionistById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addreceptionist1(Receptionist receptionist) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updatereceptionist(Receptionist receptionist) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletereceptionist(int ReceptionistId) {
		// TODO Auto-generated method stub
		
	}

}
