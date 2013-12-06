luhntest
========

Simple Luhn test to check credit cards

	The Luhn Test is checksum to see if a credit card number is valid. 
	
	1) Reverse the order of the digits in the number.
	2) Take the first, third, ... and every other odd digit in the reversed digits and sum them to form the partial sum s1
	3) Taking the second, fourth ... and every other even digit in the reversed digits:
		a) Multiply each digit by two and sum the digits if the answer is greater than nine to form partial sums for the even digits
		b) Sum the partial sums of the even digits to form s2
	If s1 + s2 ends in zero then the original number is in the form of a valid credit card number as verified by the Luhn test.
	
