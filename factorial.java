package instructor_stuff;

public class factorial {

	public static void main(String[] args) {
		System.out.println("Answers is: " + factorial_rec(-4));
	}
	
	
	
	public static int factorial_rec(int myInt) {
		if(myInt <= 0) {
			return 1;
		}else{
			return (myInt * factorial_rec(myInt - 1));		
		}
	}	
	
	public static int factorial_for(int myInt) {
		int newInt = 1;
		//Im gonna * this to other values
		
		for(; myInt > 0; myInt--) {
			newInt *= myInt;
		}
		return newInt;
	}
}