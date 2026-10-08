/*
* Title of Project: NamedCow
* Author's Name: Charlotte Collard
* Purpose: To create a class that extends the cow class and can assign a cow object a name
*
* Resources: Mrs. Ramsey-Rutledge :)
*
*/
//package Old-Mac-Donald;

public class NamedCow extends Cow {
    private String name;

    public NamedCow(String type, String sound, String name) {
        super(type, sound);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
