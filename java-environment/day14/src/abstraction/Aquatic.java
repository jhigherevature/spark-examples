package abstraction;

/*
 * Interfaces are abstract entities in which java will
 * automatically add certain keywords to.
 * 
 * Specifically, methods (and the interface as a whole) are
 * automatically established to be abstract. Interface methods
 * are also implicitly public.
 * 
 * Variables within an interface are implicitly public, static
 * and final!
 */
public interface Aquatic {
	/*
	 * the use of the keyword abstract below is not
	 * required. When we use interfaces, the keyword
	 * 'abstract' is implicit for any of our methods!
	 */
	public abstract void floatOnWater();
	
	public void sink();
}
