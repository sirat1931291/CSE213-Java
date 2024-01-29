package mainpkg;
import anotherpkg.AdminUser;

public class HelloWorld {

    public static void main(String[] args) {
        AdminUser user1 = new AdminUser("Sirat", "12345");
        String username = user1.getUsername();
        
        System.out.println(username);
        
        AdminUser user2 = new AdminUser();
        user2.setUsername("Nishat");
        user2.setPassword("12345");
        
        String user2name = user2.getUsername();
        String user2pass = user2.getPassword();
        String print = user2.toString();
        
        System.out.println(print);
    }
    
}
