package a_strings;

public class A_StringPool {
	public static void main(String[] args) {
		String s1 = new String("Hello"); // object notation
		String s2 = "Hello"; // string literal - pooled
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
		
//		
//		String s3 = "Hellos";
//		s1 = s1 + "s";
//		System.out.println("s1 :" + s1);
//		System.out.println("s3 : " + s3);
//		System.out.println("s1 == s3 : " + (s1 == s3));
//		
//		s2 += "s";
//		System.out.println("s2 :" + s2);
//		System.out.println("s3 : " + s3);
//		System.out.println("s2 == s3 : " + (s2 == s3));
//		
//		String s5 = "Cantalope";
//		
//		String s4 = "Hellos";
//		System.out.println("s3 :" + s3);
//		System.out.println("s4 : " + s4);
//		System.out.println("s3 == s4 : " + (s3 == s4));
	}
}
