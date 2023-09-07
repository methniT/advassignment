import java.util.List;

public interface ConsultantDAO {
    List<Consultant> getAllConsultants();
    Consultant getConsultantById(String id);
    void addConsultant(Consultant consultant);
    void updateConsultant(Consultant consultant);
    void deleteConsultant(int consultantId);
}
