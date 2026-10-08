/*
* Title of Class: Farm
* Author's Name: Charlotte Collard
* Purpose: To create a class that will print out the types and sounds of different animals, as well as printing the name of the cow.
*
* Resources: Mrs. Ramsey-Rutledge :)
*
*/
//package Old-Mac-Donald;

public class Farm {
 private Animal[] a = new Animal[3];
 Farm() {
  a[0] = new NamedCow("cow","moo", "Milda");
  a[1] = new Chick("chick","chickNoise");
  a[2] = new Pig("pig","oink");
 }
 public void animalSounds() {
   for (int i = 0; i < a.length; i++) {
    System.out.println(a[i].getType() + " goes " + a[i].getSound());
  }
  System.out.println("The cow is known as " +((NamedCow)a[0]).getName());
 }
}
