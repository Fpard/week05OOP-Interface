package week05CodingAssignment;

public class SpaceLogger implements Logger {

	@Override
	public void log(String aString) {
		// TODO Auto-generated method stub
		
		System.out.println("log method output:\n");
		for(int i = 0; i < aString.length(); i++) {
			
			System.out.print((aString.charAt(i)) + " ");
		}
        System.out.println();
	}

	@Override
	public void error(String aString) {
		// TODO Auto-generated method stub
		System.out.println("error method output:\n");
		System.out.print("ERROR: ");
for(int i = 0; i < aString.length(); i++) {
	
			
			System.out.print((aString.charAt(i)) + " ");
		}
	}
	
	

}
