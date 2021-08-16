package inheritancecomposition;


import inheritancecomposition_model.Person;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
/**
 * @author durga on 8/12/2021
 */
public class PersonUnitTest {
    private static Person person;

    @BeforeClass
    public static void setPersonInstance() {
        person = new Person("John", "john@domain.com", 35);
    }

    @Test
    public void givenPersonInstance_whenCalledgetName_thenEqual() {
        assertThat(person.getName()).isEqualTo("John");
    }

    @Test
    public void givenPersonInstance_whenCalledgetEmail_thenEqual() {
        assertThat(person.getEmail()).isEqualTo("john@domain.com");
    }

    @Test
    public void givenPersonInstance_whenCalledgetAge_thenEqual() {
        assertThat(person.getAge()).isEqualTo(35);
    }
}
