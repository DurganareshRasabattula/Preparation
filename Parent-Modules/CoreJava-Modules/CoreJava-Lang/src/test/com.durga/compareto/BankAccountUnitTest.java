package compareto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
/**
 * @author durga on 8/12/2021
 */
public class BankAccountUnitTest {

    @Test
    public void givenSubtractionBasedImpl_whenUsingSmallIntegers_thenComparisonWorks() {
        BankAccount accountOne = new BankAccount(5000);
        BankAccount accountTwo = new BankAccount(1000);
        int comparison = accountOne.compareTo(accountTwo);
        assertThat(comparison).isPositive();
    }

    @Test
    public void givenSubtractionBasedImpl_whenUsingLargeIntegers_thenComparisonBreaks() {
        BankAccount accountOne = new BankAccount(1900000000);
        BankAccount accountTwo = new BankAccount(-2000000000);
        int comparison = accountOne.compareTo(accountTwo);
        assertThat(comparison).isNegative();
    }

}
