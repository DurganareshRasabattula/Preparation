package listoflist;

/**
 * @author durga on 8/13/2021
 */
public class Pencil implements Stationery{
    public String name;

    public Pencil(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
