package accessmodifiers_another;

import accessmodifiers.SuperPublic;

/**
 * @author durga on 8/12/2021
 */
public class AnotherSuperPublic {
    public AnotherSuperPublic() {
        SuperPublic.publicMethod(); // Available everywhere. Let's note different package.
    }
}
