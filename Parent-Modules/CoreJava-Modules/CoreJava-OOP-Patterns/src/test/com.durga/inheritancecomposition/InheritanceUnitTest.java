package inheritancecomposition;


import inheritancecomposition_model.Actress;
import inheritancecomposition_model.Person;
import inheritancecomposition_model.Waitress;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * @author durga on 8/12/2021
 */
public class InheritanceUnitTest {
    @Test
    public void givenWaitressInstance_whenCheckedType_thenIsInstanceOfPerson() {
        assertThat(new Waitress("Mary", "mary@domain.com", 22)).isInstanceOf(Person.class);
    }

    @Test
    public void givenActressInstance_whenCheckedType_thenIsInstanceOfPerson() {
        assertThat(new Actress("Susan", "susan@domain.com", 30)).isInstanceOf(Person.class);
    }
}
