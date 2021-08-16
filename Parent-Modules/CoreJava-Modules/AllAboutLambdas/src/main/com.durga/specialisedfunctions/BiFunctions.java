package specialisedfunctions;

import domain.Employee;
import domain.Manager;

import java.util.function.BiFunction;
import java.util.function.Function;



/**
 * Class that demonstrates Predicate function usage
 * 
 * @author durga on 8/16/2021
 *
 */
public class BiFunctions {
	
	
	BiFunction<Employee, Manager, Employee> empManagerBiFunction = (emp, manager) ->{
		Employee employee = null;
		if(emp.getManager().equals(manager)) 
			employee = manager.getPersonalAssistant();
		return employee;
	};
	
	Function<Employee, Employee> emplManagerFunction = emp -> emp.getManager().getPersonalAssistant();
	
	// Single argument function
	Function<Employee, Employee> empManagerFunction = emp -> emp.getManager().getPersonalAssistant();

	private void biFunction(Employee emp, Manager manager) {
		Employee employee = empManagerBiFunction.apply(emp, manager);
		System.out.println("Employee"+employee);
	}

	private void testAndThen(Employee emp, Manager manager) {
		BiFunction<Employee, Manager, Employee> personalAssistant=  empManagerBiFunction.andThen(empManagerFunction);	
	}

	public static void main(String[] args) {
		Employee emp = new Employee(99);
		Manager manager = new Manager();
		emp.setManager(manager);
		manager.setPersonalAssistant(emp);
		new BiFunctions().biFunction(emp, manager);
	}

}
