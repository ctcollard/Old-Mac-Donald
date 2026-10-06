//package Old-Mac-Donald;

public class Chick implements Animal {
    
     public Chick(String type, String sound) {
        type = "chick";
        sound = "cluck";
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
        return "cluck";
    }

    public String getType() {
        return "chick";
    }
}
