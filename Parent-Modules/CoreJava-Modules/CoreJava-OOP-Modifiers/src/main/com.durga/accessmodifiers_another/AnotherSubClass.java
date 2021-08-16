package accessmodifiers_another;

import accessmodifiers.SuperPublic;

/**
 * @author durga on 8/12/2021
 */
public class AnotherSubClass extends SuperPublic {
    public AnotherSubClass() {
        SuperPublic.publicMethod(); // Available everywhere.
        SuperPublic.protectedMethod(); // Available in subclass. Let's note different package.
    }
}
