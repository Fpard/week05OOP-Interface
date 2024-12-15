package week05CodingAssignment;

public class App {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Logger asterik = new AsteriskLogger();
		
		System.out.println("AsteriskLogger:\n");
		asterik.log("OOPS!");
		System.out.println();
		asterik.error("My Bad");
		System.out.println();
		System.out.println();
		System.out.println("SpaceLogger:");
		Logger spaceLog = new SpaceLogger();
		System.out.println();
		spaceLog.log("Spacing out!");
		System.out.println();
		spaceLog.error("I'm tripping");
		
	}

}
