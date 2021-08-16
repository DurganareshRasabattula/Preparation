package copyconstructor;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author durga on 8/11/2021
 */
public class Manager extends Employee{
    private final List<Employee> directReports;

    public Manager(int id, String name, Date startDate, List<Employee> directReports) {
        super(id, name, startDate);
        this.directReports = directReports;
    }

    public Manager(Manager manager) {
        super(manager.id, manager.name, manager.startDate);
        this.directReports = new ArrayList<>(manager.directReports);
    }

    @Override
    public Employee copy() {
        return new Manager(this);
    }

    List<Employee> getDirectReport() {
        return this.directReports;
    }
}
