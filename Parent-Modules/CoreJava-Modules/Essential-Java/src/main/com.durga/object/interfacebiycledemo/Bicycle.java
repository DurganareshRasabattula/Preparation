/**
 * 
 */
package object.interfacebiycledemo;

/**
 * @author durga on 8/16/2021 
 */
interface Bicycle {

	// wheel revolutions per minute
	void changeCadence(int newValue);

	void changeGear(int newValue);

	void speedUp(int increment);

	void applyBrakes(int decrement);
}
