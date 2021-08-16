package immutableobjects;

/**
 * @author durga on 8/12/2021
 */
public class Currency {
    private final String value;

    private Currency(String currencyValue) {
        value = currencyValue;
    }

    public String getValue() {
        return value;
    }

    public static Currency of(String value) {
        return new Currency(value);
    }
}
