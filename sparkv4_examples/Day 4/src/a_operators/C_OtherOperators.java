package a_operators;

public class C_OtherOperators {
	public static void main(String[] args) {
		/** 1. explain unary operators: */
			// pre-incrementing
			int num = 5;
			System.out.println(++num);
			
			//post-incrementing
			int num2 = 5;
			System.out.println(num2++);
			System.out.println(num2);
			
			// pre-decrementing
			int num3 = 5;
			System.out.println(--num3);
			
			//post-decrementing
			int num4 = 5;
			System.out.println(num4--);
			System.out.println(num4);
		
		/** 1. explain shorthand assignment operators: */
			// +=
			int num5 = 10;
			System.out.println(num5 += 10);
			System.out.println(num5);
			
			// -=
			int num6 = 10;
			System.out.println(num6 -= 5);
			System.out.println(num6);
			
			// /=
			int num7 = 10;
			System.out.println(num7 /= 2);
			System.out.println(num7);
			
			// *=
			int num8 = 10;
			System.out.println(num8 *= 2);
			System.out.println(num8);
	}
}
