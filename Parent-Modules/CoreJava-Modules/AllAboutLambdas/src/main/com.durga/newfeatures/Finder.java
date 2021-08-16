package newfeatures;

/**
 * A functional interface
 * 
 * @author durga on 8/16/2021
 *
 */

public class Finder {

	@FunctionalInterface
	public interface IFinder {

		/**
		 * An abstract method
		 * 
		 * @param -find
		 * @return
		 */
		String find(String criteria);

		default String criteria() {
			return "Search criteria:";
		}
	}
	
	public static void main(String[] args) {
		IFinder finder = (s) -> "result";
	}
}
