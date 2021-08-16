package workingwithlambdas;

/**
 * Class demonstrating the lexical scoping functionality
 * @author durga on 8/16/2021
 *
 */
public class LambdaThisStaticSuperAccess extends SuperScope{
	private String instanceName="instanceVariableName";
	private static String staticName = "staticVariableName";
	
	Runnable runnableLambda = () ->{
		print("Super variable: "+super.superName);
		print("Instance variable: "+this.instanceName);
		print("Static variable: "+LambdaThisStaticSuperAccess.staticName);
	};
	
	private void execute() {
		new Thread(runnableLambda).start();
	}
	
	private void print(String string) {
		System.out.println(string);
	}
	public static void main(String[] args) {
		new LambdaThisStaticSuperAccess().execute();
	}
}
