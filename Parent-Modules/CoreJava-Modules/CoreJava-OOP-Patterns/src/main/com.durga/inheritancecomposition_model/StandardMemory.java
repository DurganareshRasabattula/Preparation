package inheritancecomposition_model;

/**
 * @author durga on 8/12/2021
 */
public class StandardMemory implements Memory{
    private final String brand;
    private final String size;

    public StandardMemory(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Memory{" + "brand=" + brand + ", size=" + size + "}";
    }
}
