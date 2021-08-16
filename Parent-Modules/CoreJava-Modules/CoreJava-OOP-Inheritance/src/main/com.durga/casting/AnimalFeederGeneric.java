package casting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author durga on 8/11/2021
 */
public class AnimalFeederGeneric<T> {
    private final Class<T> type;

    public AnimalFeederGeneric(Class<T> type) {
        this.type = type;
    }

    public List<T> feed(List<Animal> animals) {
        List<T> list = new ArrayList<T>();
        animals.forEach(animal -> {
            if (type.isInstance(animal)) {
                T objAsType = type.cast(animal);
                list.add(objAsType);
            }
        });
        return list;
    }
}
