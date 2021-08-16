package advancedlambdas;


import domain.Trade;

/**
 * Class that shows us how to use array references
 * @author durga on 8/16/2021
 *
 */
public class ArrayReferences {
	// Interface creating an array of Strings
	interface StringArray {
		String[] create(int size);
	}

	// Lambda without references
	StringArray sArrayLambda = (size) -> new String[size];

	StringArray sArrayLambdaMethodRef = String[]::new;

	// Trades array
	interface TradeArray {
		Trade[] create(int size);
	}

	// Lambda using array references
	TradeArray tradesLambdaMethodRef = Trade[]::new;
}
