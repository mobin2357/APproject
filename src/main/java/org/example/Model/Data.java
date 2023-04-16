package org.example.Model;

import java.util.ArrayList;

public class Data {
    private static ArrayList<User> users = new ArrayList<>();

    public static User getUserByName(String username) {
        return null;
        //todo
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static void sortUsersByHighScore() {
        //todo
    }

    public static int getUserRank(User user){
        sortUsersByHighScore();
        return 0;
        //todo
    }
}
