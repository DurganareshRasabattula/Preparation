package constructors;

import java.time.LocalDateTime;

/**
 * @author durga on 8/11/2021
 */
public class Transaction {
    final BankAccountEmptyConstructor bankAccount;
    final LocalDateTime date;
    final double amount;

    public Transaction(BankAccountEmptyConstructor account, LocalDateTime date, double amount) {
        this.bankAccount = account;
        this.date = date;
        this.amount = amount;
    }

    /*
     * Compilation Error :'(, all final variables must be explicitly initialised.
     * public Transaction() {
     * }
     */

    public void invalidMethod() {
        // this.amount = 102.03; // Results in a compiler error. You cannot change the value of a final variable.
    }
}
