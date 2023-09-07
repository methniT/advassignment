package factory;

import java.util.List;

public interface consultantDAO {
    void addUser(consultant consultant);
    consultant getUserById(int id);
    List<consultant> getAllUsers();
    void updateUser(consultant consultant);
    boolean deleteUser(int id);
	void updateUser1(consultant consultant);
	boolean deleteUser1(int userId);
}

