package io.zipcoder;

/**
 * Ability class that helps determines if a client
 * qualifies or not for a loan
 * Created by pcano on 10/16/15.
 */

public class Ability {

    private int points = 30;
    private int newPoints;


    /**
     * employment class substracs 3 points from total score if Person object
     * is currently unemployed
     * @param p object
     * @return int newPoints
     */
    public int employment(Person p){

        if(p.getIsEmployed ()== false){
            newPoints = points - 3;
        }else{
            newPoints = points;
        }

        return newPoints;
    }
}
