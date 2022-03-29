package iteration;

import java.util.Iterator;

public class GenericIterableNodeStack<T> implements Iterable<GenericNode<T>> {
	private GenericNode<T> top;
	
	public void push(T element) {
		GenericNode<T> node = new GenericNode<T>(element);
		push(node);
	}
	
	public void push(GenericNode<T> node) {
		node.setNext(top);
		this.top = (node);
	}
	
	public GenericNode<T> pop() {
		GenericNode<T> poppedNode = top;
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}

	public GenericNode<T> peek() {
		return top;
	}
	
	@Override
	public Iterator<GenericNode<T>> iterator() {
		return new GenericNodeIterator();
	}
	
	/*
	 * 'NodeIterator' is a nested class, i.e. a class created
	 * within another. A class is simply a template to create
	 * objects. Nested classes allow you to consolidate more 
	 * complex objects within the scope of where that object
	 * would be used. In this case, this class will control
	 * how we 'move through' a Node Stack, the example we
	 * previously examined.
	 */
	private class GenericNodeIterator implements Iterator<GenericNode<T>> {
		/*
		 * Used to track which node is 'next' 
		 * in the iterator
		 */
		private GenericNode<T> cursor;
		
		GenericNodeIterator() {
			cursor = top;
		}
		
		/*
		 * hasNext is a method from the Iterator interface
		 */
		@Override
		public boolean hasNext() {
			if (cursor != null)
				return true;
			
			return false;
		}

		/*
		 * next is a method from the Iterator interface
		 */
		@Override
		public GenericNode<T> next() {
			GenericNode<T> ret = cursor;
			if (cursor != null)
				cursor = ret.getNext();
			
			return ret;
		}
	}
}

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
