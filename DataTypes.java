/*
 * Author: David Rachal
 * Date: 10/13/2020
 * Purpose:  Show how data types work
 * 
 * 
 * 
 * 
 */

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iNumber1, iNumber2;
		iNumber1 = 10;
		iNumber2 = 3;
		byte bValue = 1;
		long lNumber = 15;
		double dblNumber = ((double)iNumber1/ 3);
		boolean isValid = false;
		char szChar = 'C';
		String szString = "David Rachal is smelly";
		
		
		//System.out.println((iNumber1%iNumber2));System.out.println((iNumber1%iNumber2)); 
		//System.out.println(dblNumber);
		
		
		
		if (!(isValid & (iNumber1 == 10))) {
			System.out.println(dblNumber);
		}else {
			System.out.println("OHHH NOOOOOO!");
		}
		
		System.out.println(szString + szChar);
		
		/*
		  +
		  -
		  /
		  *
		  %
		  =
		  ==
		  != 
		  <=
		  >=
		  >
		  <
		  |
		  & 
		   
		 */
		
		
	}

}
