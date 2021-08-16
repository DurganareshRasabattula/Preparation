package compareto;
/**
 * @author durga on 8/12/2021
 */
public class BankAccount implements Comparable<BankAccount> {

    private final int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(BankAccount anotherAccount) {
        return this.balance - anotherAccount.balance;
    }

}
