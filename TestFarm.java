//package Old-Mac-Donald;

public class TestFarm {
 public static void main(String[] args) {
    // instantiate an object
    Cow myCow = new Cow("cow", "moo");
    // using the object, print out the type + " goes " + sound
    System.out.println("The " + myCow.getType()  + " goes " + myCow.getSound());

    Pig myPig = new Pig("pig", "oink");
    System.out.println("The " + myPig.getType() + " goes " + myPig.getSound());

    Chick myChick = new Chick("chick", "cluck");
    System.out.println("The " + myChick.getType() + " goes " + myChick.getSound());
 }
}

   
