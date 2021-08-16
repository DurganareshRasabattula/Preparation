package pojo;

import java.time.LocalDate;

/**
 * @author durga on 8/12/2021
 */
public class EmployeePojo {
    public String firstName;

    public String lastName;

    private final LocalDate startDate;

    public EmployeePojo(String firstName, String lastName, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    public String name() {
        return this.firstName + " " + this.lastName;
    }

    public LocalDate getStart() {
        return this.startDate;
    }
}
