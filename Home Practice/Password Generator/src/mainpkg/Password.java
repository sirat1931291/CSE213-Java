package mainpkg;

public class Password {
    private String website;
    private String email;
    private String password;

    public Password(String website, String email, String password) {
        this.website = website;
        this.email = email;
        this.password = password;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
}
