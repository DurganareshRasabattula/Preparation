package comparing;

/**
 * @author durga on 8/12/2021
 */
public class PersonWithoutEquals {
    private final String firstName;
    private final String lastName;

    public PersonWithoutEquals(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
