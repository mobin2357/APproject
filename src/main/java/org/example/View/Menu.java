package org.example.View;

import org.example.Model.User;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private User loggedInUser;

    public Scanner getScanner(){
        //todo
        return null;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public MenuType run(){
        return null;
        //todo
    }

    public void enterMenu(String newMenu){
        //todo
    }

    public void exitMenu(){
        //todo
    }
}
