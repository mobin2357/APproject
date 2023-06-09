package org.example.View;

public enum Response {
    INVALID_COMMAND("Invalid command!"),
    EMPTY_EMAIL("Email field can't be empty!"),
    EMPTY_USERNAME("Username field can't be empty!"),
    EMPTY_PASSWORD("Password field can't be empty!"),
    EMPTY_NICKNAME("nickname field can't be empty"),
    EMPTY_SLOGAN("Slogan field can't be empty!"),
    INVALID_USERNAME_FORMAT("Invalid username format!"),
    USERNAME_EXISTS("An account with this username already exists!"),
    SHORT_PASSWORD("Password is short!"),
    PASSWORD_CAPITAL("Password must contain at least one capital letter!"),
    PASSWORD_LOWER("Password must contain at least one lowercase letter!"),
    PASSWORD_NUMBER("Password must contain at least one number!"),
    PASSWORD_SYMBOL("Password must contain at least one symbol!"),
    PASSWORD_CONFIRMATION("Password confirmation failed!"),
    EMAIL_EXISTS("An account with this email already exists!"),
    INVALID_EMAIL_FORMAT("Invalid email format!"),
    PICK_SECURITY_QUESTION("Pick your security question:" + '\n' +
            "1. What is my father's name?" + '\n' +
            "2. What is my first pet's name?" + '\n' +
            "3. What is my mother's last name?"),
    INVALID_QUESTION_NUMBER("Invalid question number!"),
    ANSWER_CONFIRMATION("Answer confirmation failed, try again!"),
    USER_CREATED("User created successfully!"),
    ENTER_MAIN_MENU("Entered main menu successfully!"),
    ENTER_SIGN_UP_MENU("Entered sign up menu!"),
    ENTER_LOGIN_MENU("Entered login menu successfully!"),
    USERNAME_DOES_NOT_EXIST("No user with this id exists!"),
    WRONG_PASSWORD("Incorrect password!"),
    LOGIN_SUCCESSFUL("Logged in successfully!"),
    LOGOUT_SUCCESSFUL("Logged out successfully!"),
    WRONG_SECURITY_ANSWER("Wrong answer!"),
    PASSWORD_CHANGE("Password changed successfully!"),
    USERNAME_CHANGE("Username changed successfully!"),
    EMAIL_CHANGE("Email changed successfully!"),
    SLOGAN_CHANGE("Slogan changed successfully!"),
    NICKNAME_CHANGE("Nickname changed successfully!"),
    SAME_USERNAME("Please enter a new username!"),
    SAME_PASSWORD("Please enter a new password!"),
    SAME_NICKNAME("Please enter a new password!"),
    SAME_EMAIL("Please enter a new password!"),
    SAME_SLOGAN("Please enter a new password!"),
    INCORRECT_OLD_PASSWORD("Current password is incorrect!"),

    RE_ENTER_PASSWORD("Please re-enter your password!"),
    SLOGAN_REMOVE("Slogan removed successfully!"),
    SLOGAN_ALREADY_NULL("This user has no slogan!"),
    SLOGAN_IS_EMPTY("Slogan is empty!");

    public final String message;
    public int test;
    public int test2;
    public int test3;
    private int testMaster;

    private Response(String message) {
        this.message = message;
    }
    public static Response getEmptyResponseByName(String name) {
        if (name.equals("email")) return EMPTY_EMAIL;
        if (name.equals("username")) return EMPTY_USERNAME;
        if (name.equals("password")) return EMPTY_PASSWORD;
        if (name.equals("nickname")) return EMPTY_NICKNAME;
        if (name.equals("slogan")) return EMPTY_SLOGAN;
        return null;
    }
}
