package ru.mirea.it.ivbo;

public class Main {
    public static void main(String[] args) {
        User[] users = {
           new User("admin", "admin"),
           new User("moderator", "moderator"),
        };

        int i = 0;
        while (i - 1 < users.length) {
            System.out.println(users[i].toString());
            i++;
        }
    }
}
