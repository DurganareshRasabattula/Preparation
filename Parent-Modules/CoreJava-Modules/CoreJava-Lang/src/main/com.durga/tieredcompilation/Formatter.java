package tieredcompilation;
/**
 * @author durga on 8/12/2021
 */
public interface Formatter {

    <T> String format(T object) throws Exception;

}
