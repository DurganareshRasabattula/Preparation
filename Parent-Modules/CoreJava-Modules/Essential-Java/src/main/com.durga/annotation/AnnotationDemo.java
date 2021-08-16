package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author durga on 8/16/2021
 */
public class AnnotationDemo {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Exception, Throwable {
		AnnotationTest test = new AnnotationTest();
		
		test.execute();

		// AnnotationTest Class
	    Class<AnnotationTest> c = AnnotationTest.class;
	    
	    // Method
	    Method method = c.getMethod("execute", new Class[]{});
	    
	    //  MyAnnotation
	    if(method.isAnnotationPresent(MyAnnotation.class)){
	    	
	        // MyAnnotation
	        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
	        

	        method.invoke(test, new Object[]{});
	        
	        // myAnnotation
	        String company = myAnnotation.company();
	        System.out.println(company);
	    }
	    

	    Annotation[] annotations = method.getAnnotations();
	    for(Annotation annotation : annotations){
	        System.out.println(annotation);
	    }
	}

}

class AnnotationTest {

	@MyAnnotation(company="https://waylau.com")
    public void execute(){
        System.out.println("do something~");
    }
}
 