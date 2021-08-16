package typeerasure;

/**
 * @author durga on 8/11/2021
 */
public class Example {
    public static  <E> boolean containsElement(E [] elements, E element){
        for (E e : elements){
            if(e.equals(element)){
                return true;
            }
        }
        return false;
    }
}
