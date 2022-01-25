class Solution {

    /*
     * Our main method, has to be a void cause main methods can't return
     * any value or you can't run the class
     *
     * Classes don't always have to have a main method
     */

    public static void main(String[] args) {

		// Variable declaration
		int x;

		// Assignment statement
		x = 3;

		// We can also declare and assign in one statement
		int y = 5;

		// variable names should start with a lower case letter and use camelCase
		int ageOfAdulthood = 18;

		// literal values of type char appear between single quotes
		char theFirstLetter = 'a';

		// use floating point types like double to represent decimal values
		double averageNumberNumberOfChildren = 2.5;

		// three different types of assignment statements
		// 1) assigning a literal
		x = 2;
		// 2) assigning from another variable
		y = x;
		// 3) assigning the result of an expression
		y = x + 3;

		// ******************
		// LITERALS
		// ******************

		int myInt = 123;
		byte myByte = 3;
        short myShort = 32000;
		//myByte = myInt;  // causes a compiler error because the int variable is capable of holding values that won't fit in a byte
		myInt = myByte;

		// Hexadecimal literals are preceded by 0x
		int twentySix = 0x1A;
        System.out.println("Hexadecimal Literal: " + twentySix);

		// **********************
		// TRUNCATION AND CASTING
		// **********************

		double aDouble = 7.89;
		// int anInteger = aDouble;  // this is a compiler error
		int anInteger = (int)aDouble;  // this will truncate the fractional part of the double
		System.out.println(aDouble+" cast to an int is equal to: "+anInteger);

		// **********************
		// ARITHMETIC OPERATORS
		// **********************
		int a = 12;
		System.out.println("What happens to b?");
		int b = a + 3;  // ADDITION
		System.out.println(b);
		b = a - 5;  // SUBTRACTION
		System.out.println(b);
		b = a * 2;  // MULTIPLICATION
		System.out.println(b);
		b = a / 2;  // DIVISION
		System.out.println(b);

		// Modulus division
		int remainder = 10 % 3;
		System.out.println("The remainder of dividing 10 by 3 is "+remainder);
    }

}
