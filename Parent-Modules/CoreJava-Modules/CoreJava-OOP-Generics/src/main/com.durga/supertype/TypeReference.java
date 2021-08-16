package supertype;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


/**
 * @author durga on 8/11/2021
 */
public abstract class TypeReference<M> {
    private final Type type;

    public TypeReference() {
        Type superclass = getClass().getGenericSuperclass();
        type = ((ParameterizedType) superclass).getActualTypeArguments()[0];
    }

    public Type getType() {
        return type;
    }
}
