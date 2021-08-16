package constructors;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author durga on 8/11/2021
 */
public class ConstructorUnitTest {
    @Test
    public void givenNoExplicitConstructor_whenUsed_thenFails() {
        BankAccount account = new BankAccount();
        Assertions.assertThatThrownBy(account::toString).isInstanceOf(Exception.class);
    }

    @Test
    public void givenNoArgumentConstructor_whenUsed_thenSucceeds() {
        BankAccountEmptyConstructor account = new BankAccountEmptyConstructor();
        Assertions.assertThatCode(account::toString).doesNotThrowAnyException();
    }

    @Test
    public void givenParameterisedConstructor_whenUsed_thenSucceeds() {
        LocalDateTime opened = LocalDateTime.of(2018, Month.JUNE, 29, 6, 30, 0);
        BankAccountParameterizedConstructor account =
                new BankAccountParameterizedConstructor("Tom", opened, 1000.0f);

        Assertions.assertThatCode(account::toString).doesNotThrowAnyException();
    }

    @Test
    public void givenCopyConstructor_whenUser_thenMaintainsLogic() {
        LocalDateTime opened = LocalDateTime.of(2018, Month.JUNE, 29, 6, 30, 0);
        BankAccountCopyConstructor account = new BankAccountCopyConstructor("Tim", opened, 1000.0f);
        BankAccountCopyConstructor newAccount = new BankAccountCopyConstructor(account);

        assertThat(account.getName()).isEqualTo(newAccount.getName());
        assertThat(account.getOpened()).isNotEqualTo(newAccount.getOpened());

        assertThat(newAccount.getBalance()).isEqualTo(0.0f);
    }

    @Test
    public void givenChainedConstructor_whenUsed_thenMaintainsLogic() {
        BankAccountChainedConstructors account = new BankAccountChainedConstructors("Tim");
        BankAccountChainedConstructors newAccount = new BankAccountChainedConstructors("Tim", LocalDateTime.now(), 0.0f);

        assertThat(account.getName()).isEqualTo(newAccount.getName());
        assertThat(account.getBalance()).isEqualTo(newAccount.getBalance());
    }
}
