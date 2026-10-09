/*
* Title of Class: Chick
* Author's Name: Charlotte Collard
* Purpose: To create a chick class that can return either the sound "cheep" or the sound "cluck"
*
* Resources: Mrs. Ramsey-Rutledge :)
*
*/
//package Old-Mac-Donald;

public class Chick implements Animal {
    private String type;
    private String sound;
    
     public Chick(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public String getSound() {
        int min = 0;
        int max = 1;
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        if (randomNum == 0) {
            return "cheep";
        }
        if (randomNum == 1) {
	        return "cluck";
        }
        return sound;
    }

    public String getType() {
        return type;
    }
}
