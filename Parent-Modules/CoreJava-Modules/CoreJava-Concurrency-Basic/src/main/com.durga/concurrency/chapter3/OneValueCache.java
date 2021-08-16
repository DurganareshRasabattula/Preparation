package concurrency.chapter3;

import concurrency.annotation.Immutable;

import java.math.BigInteger;
import java.util.Arrays;


/**
 * 3-12 缓存数值的不可变容器类
 */
@Immutable
public class OneValueCache {

    private final BigInteger lastNumber;

    private final BigInteger[] lastFactors;

    public OneValueCache(BigInteger i, BigInteger[] factors) {
	this.lastNumber = i;
	this.lastFactors = Arrays.copyOf(factors, factors.length);
    }

    public BigInteger[] getFactors(BigInteger i) {
	if (lastNumber == null || !lastNumber.equals(i)) {
	    return null;
	} else {
	    return Arrays.copyOf(lastFactors, lastFactors.length);
	}
    }
}
