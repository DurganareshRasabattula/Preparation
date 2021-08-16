package introducinglambdas;

import domain.Trade;

public class TradeMerger {

	/**
	 * Functional interface for merging trades
	 * @author durga on 8/16/2021
	 *
	 */
	interface Merger {
		Trade merge(Trade t1, Trade t2);
	}

	public static void main(String[] args) {

	}
}
