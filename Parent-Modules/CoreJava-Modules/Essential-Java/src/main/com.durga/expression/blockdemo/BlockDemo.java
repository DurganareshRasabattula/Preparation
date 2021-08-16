/**
 * 
 */
package expression.blockdemo;

/**
 * @author durga on 8/16/2021 
 */
class BlockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean condition = true;
		if (condition) { // begin block 1
			System.out.println("Condition is true.");
		} // end block one
		else { // begin block 2
			System.out.println("Condition is false.");
		} // end block 2
	}
}
