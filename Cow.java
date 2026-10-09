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
    private String type;
    private String sound;

    public Cow(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }
    
    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }
}
