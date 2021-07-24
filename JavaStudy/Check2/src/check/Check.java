package check;

public class Check {
	private static String firstName = "Masaomi";
	private static String lastName = "Onjo";

	private static String printName = (lastName + firstName);
	
	public static void main(String[] args) {

    System.out.println("printNameメソッド→" + printName);
    
    Pet jp	= new Pet(firstName, lastName);
    jp.introduce(); 
    RobotPet ap = new RobotPet(firstName, lastName);
    ap. introduce();
	}
}


