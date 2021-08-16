package interfaces;

import java.util.Comparator;

/**
 * @author durga on 8/11/2021
 */
public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employeeA, Employee employeeB) {
        if (employeeA.getSalary() < employeeB.getSalary()) {
            return -1;
        } else if (employeeA.getSalary() > employeeB.getSalary()) {
            return 1;
        } else {
            return 0;
        }
    }
}
