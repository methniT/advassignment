
public class Receptionist {

    private int id;
    private String fullname;
    private String mobilenumber;
    private String email;
    private String username;
    private String password;


    public Receptionist() {
    }

    public Receptionist(int id, String fullname, String mobilenumber, String email, String username, String password) {
        this.id = id;
        this.fullname = fullname;
        this.mobilenumber = mobilenumber;
        this.email = email;
        this.username = username;
        this.password = password;
    }



    public int getId() {
        return id;
    }

    public void setId1(int receptionistId) {
        this.id = receptionistId;
    }

    public String getfullname() {
        return fullname;
    }

    public void setfullname(String fullname) {
        this.fullname = fullname;
    }
    
    public String getmobilenumber() {
        return mobilenumber;
    }

    public void setmobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "receptionist [id=" + id + ", fullname=" + fullname + ", "
            + "mobilenumber=" + mobilenumber + ", email=" + email + ", "
            + "username=" + username + ", password=" + password + "]";
    }

	public void setId(String string) {
		
	}

	public void add(Receptionist receptionist1) {
		// TODO Auto-generated method stub
		
	}

}


