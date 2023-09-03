import factory.consultantDAO;
import factory.consultantDAOimplement;

public class MySQLDAOFactory implements DAOFactory {
  
    
    @Override
    public consultantDAO createConsultantDAO() {
        return new consultantDAOimplement(); 
    }
}

