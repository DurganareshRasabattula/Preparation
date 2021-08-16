package inheritance;

/**
 * @author durga on 8/11/2021
 */
public class Employee {
    private final String name;
    private final Car car;

    public Employee(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
