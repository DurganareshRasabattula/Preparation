/**
 * 
 */
package generic.generic.boxdemo;

/**
 * @author durga on 8/16/2021 
 */
public class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}
