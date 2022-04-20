package generics;

/*
 * The Following Class is an altered version of the NodeStack
 * class within our collections package.
 * 
 * Note that this file also includes a 'Generic Node' class, 
 * which is an altered version of the Node class in the 
 * collections package. This class is a closer representation
 * of how code within the java.util package is structured.
 */
public class GenericNodeStack<T> {
	GenericNode<T> top;
	
	/*
	 * Note that we can pass a generic from one class
	 * to another class that also declares a generic type
	 */
	public void push(GenericNode<T> node) {
		node.setNext(top);
		this.top = node;
	}
	
	public void push(T data) {
		GenericNode<T> temp = new GenericNode<T>(data);
		push(temp);
	}
	
	public GenericNode<T> pop() {
		GenericNode<T> popped = top;
		top = top.getNext();

		popped.setNext(null);		
		return popped;
	}

	public GenericNode<T> peek() {
		return top;
	}
}

/*
 * The Following Class is an altered version of the Node
 * class within the collections package. This class exists
 * within the same file as our Generic Node Stack, since
 * we only plan to use Generic nodes within the context
 * of GenericNodeStack objects or possibly other classes
 * within this package.
 */
class GenericNode<T> {
	private T data;
	private GenericNode<T> next;

	public GenericNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public GenericNode<T> getNext() {
		return next;
	}

	public void setNext(GenericNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
