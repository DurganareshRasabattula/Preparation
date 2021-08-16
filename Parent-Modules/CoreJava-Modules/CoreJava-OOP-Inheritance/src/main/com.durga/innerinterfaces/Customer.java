package innerinterfaces;

/**
 * @author durga on 8/11/2021
 */
public class Customer {
    public interface List {
        void Add(Customer customer);

        String getCustomerNames();
    }

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
