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
