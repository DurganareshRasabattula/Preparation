/**
 * 
 */
package operator.bitdemo;

/**
 * @author durga on 8/16/2021 
 */
class BitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int bitmask = 0x000F;
		int val = 0x2222;
		// prints "2"
		System.out.println(val & bitmask);
	}
}
