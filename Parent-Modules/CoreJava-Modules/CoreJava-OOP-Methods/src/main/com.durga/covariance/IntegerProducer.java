package covariance;

/**
 * @author durga on 8/12/2021
 */
public class IntegerProducer extends Producer{
    @Override
    public Integer produce(String input) {
        return Integer.parseInt(input);
    }
}
