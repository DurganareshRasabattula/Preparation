package modifiers_otherpackage;

import modifiers.FirstClass;

/**
 * @author durga on 8/12/2021
 */
public class SecondClass extends FirstClass {
    public SecondClass(String name) {
        // accessing protected constructor
        super(name);
        // using protected method
        System.out.println("SecondClass name is " + this.getName());
        // accessing a protected field
        this.name = "new name";
        // instantiating protected inner class -> add public constructor to InnerClass
        FirstClass.InnerClass innerClass = new FirstClass.InnerClass();
    }
}
