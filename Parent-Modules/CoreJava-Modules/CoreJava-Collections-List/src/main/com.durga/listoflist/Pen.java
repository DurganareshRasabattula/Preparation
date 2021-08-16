package listoflist;

/**
 * @author durga on 8/13/2021
 */
public class Pen implements Stationery{
    public String name;

    public Pen(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
