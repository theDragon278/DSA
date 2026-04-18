class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username, String password) {
        if (this.password.equals(password)) {
            this.username = username;
        } else {
            System.out.println("Incorrect password. Username not updated.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        User user = new User("Ambarish", "password123");
        System.out.println("Username: " + user.getUsername());
        user.setUsername("Ambarish Behera", "password123"); // Correct password
        System.out.println("Updated Username: " + user.getUsername());
        user.setUsername("Ambarish Behera theGR8", "wrongpassword"); // Incorrect password
        System.out.println("Username after failed update: " + user.getUsername());
    }
}
