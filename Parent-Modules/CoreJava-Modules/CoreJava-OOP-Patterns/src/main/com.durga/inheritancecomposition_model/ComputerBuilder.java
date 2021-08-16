package inheritancecomposition_model;

/**
 * @author durga on 8/12/2021
 */
public abstract class ComputerBuilder {
    public final void buildComputer() {
        addProcessor();
        addMemory();
    }

    public abstract void addProcessor();

    public abstract void addMemory();
}
