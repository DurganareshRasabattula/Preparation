package synthetic;

/**
 * @author durga on 8/12/2021
 *
 * Wrapper for a class which contains a synthetic constructor.
 */
public class SyntheticConstructorDemo {
    /**
     * We need to instantiate the {@link NestedClass} using a private
     * constructor from the enclosing instance in order to generate a synthetic
     * constructor.
     */
    private final NestedClass nestedClass = new NestedClass();

    /**
     * Class which contains a synthetic constructor.
     *
     */
    class NestedClass {

        /**
         * In order to generate a synthetic constructor, this class must have a
         * private constructor.
         */
        private NestedClass() {
        }
    }
}
