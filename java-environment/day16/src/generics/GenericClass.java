package generics;

/*
 * Generics are a way to define a placeholder for a 
 * non-primitive that can be supplied to a class/interface
 * when creating an object.
 * 
 * Generics are commonly used with Datastructures.
 * 
 * Below, "Placeholder" is a generic declaration for the
 * class "GenericClass".
 * 
 * Generics use 'diamond' notation : i.e. '< >'
 * Classes:
 * [access_mod] class [ClassName]<Generic> {
 *     // class body... 
 * }
 * 
 * Interfaces:
 * [access_mod] interface [InterfaceName]<Generic> {
 *     // interface body... 
 * }
 */
public class GenericClass<Placeholder> {
	private Placeholder data;
	
	public GenericClass(Placeholder data) {
		this.data = data;
	}
	
	public Placeholder getData() {
		return data;
	}
	public void setData(Placeholder data) {
		this.data = data;
	}
}
