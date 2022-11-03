package b_abstraction.a_classes;

/** 1. Create Cat class, have it extend Animal. DO NOT include purchase() until after interface introduced in base class */
public class B_Cat extends A_Animal {

	public B_Cat(String name) {
		super(name);
	}
	
	public void talk() {
		System.out.println("meow!");
	}

	@Override
	public void purchase() {
		System.out.println(name + " the cat was purchased. They purr in happiness!");
	}

}
