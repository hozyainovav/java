package ru.mirea.it.ivbo;

public class User {

    static int count;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        count++;
        this.username = username;
        this.password = password;
    }

    public User() {
        count++;
        this.username = "Default";
        this.password = "Default";
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password;
    }
}
