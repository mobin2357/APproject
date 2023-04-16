package org.example.View;

public enum Response {
    INVALID_GROUND("The ground is not proper for this building!"),
    BUILDING_ALREADY_EXIST("A building already exist in this cell!"),
    DROP_BUILDING_SUCCESSFUL("Drop building successful!"),
    POPULATION_EXCEEDED("Population exceeded!"),
    NOT_ENOUGH_MONEY("You don't have enough money to build this building!"),
    GAME_STARTED_SUCCESSFULLY("Game started successfully!"),
    USER_NOT_FOUND("User not found!"),
    ;
    public final String message;

    private Response(String message) {
        this.message = message;
    }
}
