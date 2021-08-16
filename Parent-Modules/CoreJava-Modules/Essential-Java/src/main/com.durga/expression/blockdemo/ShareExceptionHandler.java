/**
 * 
 */
package expression.blockdemo;

/**
 * @author durga on 8/16/2021 
 */
public class ShareExceptionHandler {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		// not share exception handler
		int[] intArray = new int[3];
		try {
			for (int i = 0; i <= intArray.length; i++) {
				intArray[i] = i;
				System.out.println("intArray[" + i + "] = " + intArray[i]);
				System.out.println("intArray[" + i + "]模 " + (i - 2) + "的值:  " + intArray[i] % (i - 2));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("异常信息：" + e);
		} catch (ArithmeticException e) {
			System.out.println("异常信息：" + e);
		}
		System.out.println("程序正常结束。");
		
		// share exception handler
		intArray = new int[3];
		try {
			for (int i = 0; i <= intArray.length; i++) {
				intArray[i] = i;
				System.out.println("intArray[" + i + "] = " + intArray[i]);
				System.out.println("intArray[" + i + "]模 " + (i - 2) + "的值:  " + intArray[i] % (i - 2));
			}
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println( e);
		}  
		System.out.println("");
	}

}
