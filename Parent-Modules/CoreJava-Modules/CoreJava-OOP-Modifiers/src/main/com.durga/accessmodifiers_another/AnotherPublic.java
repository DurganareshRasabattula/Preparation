package accessmodifiers_another;

import accessmodifiers.SuperPublic;

/**
 * @author durga on 8/12/2021
 */
public class AnotherPublic {
    public AnotherPublic() {
        SuperPublic.publicMethod(); // Available everywhere.
    }
}
