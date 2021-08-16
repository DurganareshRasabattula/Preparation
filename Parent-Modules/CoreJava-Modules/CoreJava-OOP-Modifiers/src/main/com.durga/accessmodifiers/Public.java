package accessmodifiers;

/**
 * @author durga on 8/12/2021
 */
public class Public {
    public Public() {
        SuperPublic.publicMethod(); // Available everywhere.
        SuperPublic.protectedMethod(); // Available in the same package or subclass.
        SuperPublic.defaultMethod(); // Available in the same package.
    }
}
