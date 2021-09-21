package access;

public class Simulator {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pubString);
		System.out.println(p.proString);
		System.out.println(p.defString);
//		System.out.println(p.priString);
	}
}
