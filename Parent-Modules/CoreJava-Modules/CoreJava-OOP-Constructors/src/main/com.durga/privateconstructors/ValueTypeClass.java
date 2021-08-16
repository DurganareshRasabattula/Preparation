package privateconstructors;

/**
 * @author durga on 8/11/2021
 */
public class ValueTypeClass {
    private final String value;
    private final String type;

    public ValueTypeClass(int x) {
        this(Integer.toString(x), "int");
    }

    public ValueTypeClass(boolean x) {
        this(Boolean.toString(x), "boolean");
    }

    private ValueTypeClass(String value, String type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
