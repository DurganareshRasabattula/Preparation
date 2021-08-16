package booleanoperators;

/**
 * @author durga on 8/12/2021
 */
public class Car {
    private final boolean diesel;
    private final boolean manual;

    public Car(boolean diesel, boolean manual) {
        this.diesel = diesel;
        this.manual = manual;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public boolean isManual() {
        return manual;
    }

    static Car dieselAndManualCar() {
        return new Car(true, true);
    }

    static Car dieselAndAutomaticCar() {
        return new Car(true, false);
    }

    static Car oilAndManualCar() {
        return new Car(false, true);
    }

    static Car oilAndAutomaticCar() {
        return new Car(false, false);
    }
}
