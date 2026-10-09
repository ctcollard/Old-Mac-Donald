/*
* Title of Class: Pig
* Author's Name: Charlotte Collard
* Purpose: To create a pig class that will return the sound oink
*
* Resources: Mrs. Ramsey-Rutledge :)
*
*/
//package Old-Mac-Donald;

public class Pig implements Animal {
    private String type;
    private String sound;
    
     public Pig(String type, String sound) {
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