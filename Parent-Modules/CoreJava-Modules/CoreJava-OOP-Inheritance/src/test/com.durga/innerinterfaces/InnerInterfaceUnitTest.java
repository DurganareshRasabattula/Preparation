package innerinterfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author durga on 8/11/2021
 */
public class InnerInterfaceUnitTest {
    @Test
    public void whenCustomerListJoined_thenReturnsJoinedNames() {
        Customer.List customerList = new CommaSeparatedCustomers();
        customerList.Add(new Customer("customer1"));
        customerList.Add(new Customer("customer2"));
        assertEquals("customer1,customer2", customerList.getCustomerNames());
    }
}
