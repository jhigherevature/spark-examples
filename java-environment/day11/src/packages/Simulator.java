package packages;

/*
 * By default, java will look in two places when trying to determine
 * what a class/datatype is referring to. It will look into the
 * java.lang package in the JRE. As well as the other classes
 * in the same package
 */
public class Simulator {
	public static void main(String[] args) {
		/*
		 * A fully Qualified class name (FQCN) is a declaration
		 * of a class with the package declaration as a prefix
		 */
		instances.Dog d = new instances.Dog("Steve", "Pit Bull");
	}
}
