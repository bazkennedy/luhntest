public class Luhn {
    /*
	The Luhn Test is checksum to see if a credit card number is valid. 
	
	1) Reverse the order of the digits in the number.
	2) Take the first, third, ... and every other odd digit in the reversed digits and sum them to form the partial sum s1
	3) Taking the second, fourth ... and every other even digit in the reversed digits:
		a) Multiply each digit by two and sum the digits if the answer is greater than nine to form partial sums for the even digits
		b) Sum the partial sums of the even digits to form s2
	If s1 + s2 ends in zero then the original number is in the form of a valid credit card number as verified by the Luhn test.
	
	*/
	
	
	public static void main(String[] args) {
        System.out.println(luhnTest("49927398716"));
        System.out.println(luhnTest("49927398717"));
        System.out.println(luhnTest("1234567812345678"));
        System.out.println(luhnTest("1234567812345670"));
		
		
       }
 
    public static boolean luhnTest(String number){
     	int oddSums = 0;
		int evenSums = 0;
		
		String reverse = new StringBuffer(number).reverse().toString();
		
		for(int i = 0 ;i < reverse.length();i++){
            int digit = Character.digit(reverse.charAt(i), 10);
			if(i%2==0) { //if odd (i starts at 0 so odd numbers are indexed 0, 2, 4....
				oddSums += digit;	
			}
			else{ //if even
				evenSums += digit * 2;
				  if(digit >= 5){
                    evenSums -= 9;
                }
			}
			
		}   
		return (oddSums + evenSums) % 10 == 0;
    }
}