package org.example.Controller.GameControllers;

import org.example.Model.Kingdom;
import org.example.View.MainMenu;
import org.example.View.Response;

import java.util.regex.Matcher;

public class KingdomController {
    public static Kingdom currentPlayer;
    public static Response showPopularityFactors(){

        return null;
        //todo
    }

    public static int showPopularity(){
        return currentPlayer.getHappiness();
    }

    public static Response showFoodList(){
        return null;
        //todo
    }

    public static Response setFoodRate(Matcher matcher){
        return null;
        //todo
    }

    public static Response showFoodRate(){
        return null;
        //todo
    }

    public static Response setTaxRate(Matcher matcher){
        return null;
        //todo
    }

    public static Response showTaxRate(){
        return null;
        //todo
    }

    public static Response setFearRate(Matcher matcher){
        return null;
        //todo
    }

    public static Response exit(){
        return null;
        //todo
    }
}
