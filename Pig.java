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
    
     public Pig(String type, String sound) {
        type = "pig";
        sound = "oink";
    }

    public String getSound() {
        return "oink";
    }

    public String getType() {
        return "pig";
    }
}