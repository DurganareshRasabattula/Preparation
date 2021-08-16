package inheritancecomposition_model;

/**
 * @author durga on 8/12/2021
 */
public class StandardSoundCard implements SoundCard{
    private final String brand;

    public StandardSoundCard(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "SoundCard{" + "brand=" + brand + "}";
    }
}
