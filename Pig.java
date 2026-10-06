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