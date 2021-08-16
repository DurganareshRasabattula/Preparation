package objectclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author durga on 8/12/2021
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Borrower extends User{
    private double totalLoanAmount;

    public void requestLoan(double amount) {
        totalLoanAmount = amount;
    }

    public double payLoan(double amount) {
        return totalLoanAmount - amount;
    }
}
