package week05CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String aString) {
		// TODO Auto-generated method stub
		   System.out.println("Log method output:\n");
		   System.out.println("***" + aString + " ***");
		   
	}

	@Override
	public void error(String aString) {
		// TODO Auto-generated method stub
		
		 System.out.println("Error method output:\n");
		 System.out.println("****************");
		 System.out.println("***Error: " + aString + " ***");
		 System.out.println("****************");
	}

	public void describe(String desc) {
		System.out.println();
		System.out.println(desc);
	}
	
	
}
