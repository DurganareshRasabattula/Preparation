package interfaces;

import domain.Patient;

public class InheritanceRules {
	
	/**
	 * A general physician operating a patient
	 * @author durga on 8/16/2021
	 *
	 */
	interface Doctor{
		default String operate(Patient p){
			return "Patient is being operated by a general physician";
		}
	}
	
	/**
	 * A patient being operated by a specialist 
	 * @author durga on 8/16/2021
	 *
	 */
	interface Surgeon{
		default String operate(Patient p){
			return "Patient is being operated by a specialist";
		}
	}
	
	/**
	 * This class compilation fails as compiler is thoroughly confused as to whose method it shoudl pick
	 * @author durga on 8/16/2021
	 *
	 */
//	class Hospital implements Doctor, Surgeon{
//		private String admitAndOperate(Patient p){
//			return operate(p);
//		}
//	}
	
	/**
	 * Create a method to provide the specific logic
	 * @author mkonda
	 *
	 */
	class Hospital1 implements Doctor, Surgeon{
		// Overriding with own implementation
		public String operate(Patient p){
			return "Patient operated";
		}
	}
	
	/**
	 * If we wish to grab one of the interface's implementations, use super keyword
	 * @author mkonda
	 *
	 */
	class Hospital2 implements Doctor, Surgeon{
		public String operate(Patient p){
			return Doctor.super.operate(p);
		}
	}
}
