package inheritancecomposition_model;

/**
 * @author durga on 8/12/2021
 */
public class StandardProcessor implements Processor{
    private final String model;

    public StandardProcessor(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Processor{" + "model=" + model + "}";
    }
}
