package c_stacktraces;

/** 1. Pre-prepare this class */
public class MathInvoker {
	public void invokeMath(int a, int b) {
		Divider d = new Divider();
		d.divide(a, b);
	}
}
