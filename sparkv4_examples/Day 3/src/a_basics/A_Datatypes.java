package a_basics;

public class A_Datatypes {
	public static void main(String[] args) {
		/** 1. explain single-line and multi-line comments */
		
		/** 2. explain variable naming rules and conventions */
			// can contain letters, numbers, $, and underscores and SHOULD start with letter
			
			// CANNOT start with number or contain other special characters
		
			// explain naming conventions
				// camelCase is best practice for variables
				
				// PascalCase / UpperCamelCase used for class names, which MUST match file name
		
				// variables should be short and meaningful
			
			
		/** 3. introduce the boolean datatype and explain the differences in some terms: */
			// statement vs expression
			boolean myBool = true;
			
			// variable declaration vs initialization vs re-assignment
			boolean myBool2;
			myBool2 = true;
			
		/** 4. explain the primitive datatypes: */
				
			// number data types
				// whole number types
					// byte - 1 byte / 8 bits
					byte myMinByte = -128;
					byte myMaxByte = 127;
					
					// short - 2 bytes / 16 bits
					short myMinShort = -32_768;
					short myMaxShort = 32_767;
					
					// char - 2 bytes / unicode characters / range is from 0 to 65,535
					char myChar = 'a';
					char myOtherChar = 97;
					System.out.println(myChar); // prints a
					System.out.println(myOtherChar); // prints a
					
					// int - 4 bytes / 32 bits
					// default whole number data type
					int myMinInt = -2_147_483_648;
					int myMaxInt = 2_147_483_647;
					
					// long - 8 bytes / 64 bits
					long myMinLong = -9_223_372_036_854_775_808L;
					long myMaxLong = 9_223_372_036_854_775_807L;
					
				// decimal numbers
					// float - 4 bytes - 6 to 7 decimal places
					float myFloat =  5.55555555555555555F;
					
					// double - 8 bytes - 15 to 16 decimal places
					double myDouble = 5.55555555555555555D;		
	}
	
}
