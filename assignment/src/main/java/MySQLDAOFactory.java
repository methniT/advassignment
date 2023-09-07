


public class MySQLDAOFactory implements DAOFactory {
  
    
    @Override
    public ConsultantDAOImpl createConsultantDAO() {
        return new ConsultantDAOImpl(); 
    }
    @Override
    public ReceptionistDAOImpl createReceptionistDAO() {
        return new ReceptionistDAOImpl(); 
    }
    
}

