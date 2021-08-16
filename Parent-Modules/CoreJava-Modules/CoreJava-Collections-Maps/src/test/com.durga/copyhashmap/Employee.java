package copyhashmap;

import java.io.Serializable;

/**
 * @author durga on 8/13/2021
 */
public class Employee implements Serializable {
    private String name;

    public Employee(String name) {
        super();
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
