package objects;

public class Simulator {
	public static void main(String[] args) {
		Data d_1 = new Data("Data", 100, 99.99);
		Data d_2 = new Data("Data", 100, 99.99);
		
		System.out.println(d_1);
		System.out.println(d_2);
		
		/*
		 * By Default, the .equals method has the
		 * same comparison as the "==" operator
		 */
		System.out.println(d_1 == d_2);
		System.out.println(d_1.equals(d_2));
	}
}
