package innerinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author durga on 8/11/2021
 */
public class CommaSeparatedCustomers implements Customer.List{
    private final List<Customer> customers = new ArrayList<>();

    @Override
    public void Add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public String getCustomerNames() {
        return customers.stream().map(Customer::getName).collect(Collectors.joining(","));
    }
}
