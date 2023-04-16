package org.example.Model;

public class User {
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String answerToQuestion;
    private int questionIndex;
    private String slogan;
    private int highScore;

    public User(String username, String password, String nickname, String email, String slogan, String answerToQuestion, int questionIndex) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.slogan = slogan;
        this.answerToQuestion = answerToQuestion;
        this.questionIndex = questionIndex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isPasswordCorrect(String password) {
        return (this.password.equals(password));
    }

    public void changePassword(String newPassword, String oldPassword) {
        //Todo
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAnswerToQuestionCorrect(String answerToQuestion) {
        return answerToQuestion.equals(this.answerToQuestion);
    }

    public int getQuestionIndex() {
        return questionIndex;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getRank() {
        return Data.getUserRank(this);
    }
}
