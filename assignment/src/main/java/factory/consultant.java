package factory;

public class consultant {
    private String id;
    private String fullname;
    private String mobilenumber;
    private String email;
    private String username;
    private String password;

    // Constructors
    public consultant() {
    }

    public consultant(String id, String fullname, String mobilenumber, String email, String username, String password) {
        this.id = id;
        this.fullname = fullname;
        this.mobilenumber = mobilenumber;
        this.email = email;
        this.username = username;
        this.password = password;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    // toString() method for debugging and logging
    @Override
    public String toString() {
        return "consultant [id=" + id + ", fullname=" + fullname + ", "
            + "mobilenumber=" + mobilenumber + ", email=" + email + ", "
            + "username=" + username + ", password=" + password + "]";
    }

}
