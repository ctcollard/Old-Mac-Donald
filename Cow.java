/*
* Title of Class: Cow
* Author's Name: Charlotte Collard
* Purpose: To create a cow class that returns the sound "moo"
*
* Resources: Mrs. Ramsey-Rutledge :)
*
*/
//package Old-Mac-Donald;

public class Cow implements Animal {

    public Cow(String type, String sound) {
        type = "cow";
        sound = "moo";
    }
    
    public String getSound() {
        return "moo";
    }

    public String getType() {
        return "cow";
    }
}
