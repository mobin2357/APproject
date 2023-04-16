package org.example.View;

import java.util.regex.Matcher;

public enum Commands {
    ;
    private String regex;

    Commands(String regex) {
        this.regex = regex;
    }

    public static Matcher getMatcher(String command, Commands commandRegex){
        return null;
        //todo
    }
}
