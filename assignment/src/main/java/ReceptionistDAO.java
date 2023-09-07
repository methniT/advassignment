import java.util.List;

public interface ReceptionistDAO {
    List<Receptionist> getAllReceptionists();
    Receptionist getReceptionistById(String id);
    void addreceptionist1(Receptionist receptionist);
    void updatereceptionist(Receptionist receptionist);
    void deletereceptionist(int ReceptionistId);
}
