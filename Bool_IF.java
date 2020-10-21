
public class Bool_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* BINARY OPERATORS
			-- Binary is way to represent a two option situation, like True/False or something/nothing or for a computer 1/0
			-- OPERATORS the symbols that allow the option to be presented ( ==, !=, &&, || )
			
			==  do they equal? yes or no.
			!= 	do they not equal? yes or no.
			<  	less than the first? yes or no.
			<=  less than or equal to the first? yes or no.
			>  	greater than the first? yes or no.
			>=  greater than or equal to the first? yes or no.
			
______  Not Technically BINARY OPERATOR BUT THEY DO RETURN A BINARY RESULT __________
			&& 	are both true? yes or no.
			|| 	is one true? yes or no.
						
		*/
		int first = 0;
		int second = 0;
		String szName = "David Rachal";
		String szNickName = "That Guy";
		
/*
 * Now lets use those in some if statements
 * 
 */		
		
		//  1)  Classic if/else
		
		if(first == second) {
			szName = "Hells yeah!";
		} else {
			szName = "How Could this be???";
		}
		
		// Add in a if/elseif
		if(first < (second + 3)  ) 
		{
			szName = "Hells yeah!";
		}
		else if(first == second) 
		{
			szName = "I Must be true";
		}
		else 
		{
			szName = "I SHOULD NO BE!!";
		}
	
		//  2)   if statement on one line
		if( first != (second + 1) ) { System.out.println("They are not equal"); }
		
		
		// a if/else statement with one line of execution without {}
		if( first == second)
			System.out.println("They are Equal");
		else
			System.out.println("They ai'nt Equal");
		
		
		//  variable of correct type = (condition) ? return if true : return if false ;
		//  this return type is a String, but you can use any data type	
		szName = (first >= second) ? "yeah yeah" : "Oh hells no";
		System.out.println(szName);
		
		switch (first) {
		case 0:
			szName = "David Again";
			break;
		case 1:
			szName = "Timmy First";
			break;
		default :
			szName = "Rando_97";
			
		}

	}// END MAIN

}// END CLASS
