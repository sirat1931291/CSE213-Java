package anotherpkg;

public class AdminUser {
    private String username;
    private String password;

    public AdminUser() {
        
    }

    public AdminUser(String username) {
        this.username = username;
    }
    

    public AdminUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AdminUser{" + "username=" + username + ", password=" + password + '}';
    }
    
    
}
