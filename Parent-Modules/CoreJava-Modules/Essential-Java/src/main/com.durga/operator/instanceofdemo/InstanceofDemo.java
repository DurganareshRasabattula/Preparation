/**
 * 
 */
package operator.instanceofdemo;

/**
 * @author durga on 8/16/2021 
 */
class InstanceofDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Must qualify the allocation with an enclosing instance of type InstanceofDemo 
		Parent obj1 = new InstanceofDemo().new Parent();
        Parent obj2 = new InstanceofDemo().new Child();

        System.out.println("obj1 instanceof Parent: "
            + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
            + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
            + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
            + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
            + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
            + (obj2 instanceof MyInterface));
	}

	class Parent {}
	class Child extends Parent implements MyInterface {}
	interface MyInterface {}
}
