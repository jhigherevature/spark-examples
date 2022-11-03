package b_abstraction.a_classes;

/** 1. Create Toy class. Do not include purchase() until after interface introduced in base class */
public class D_Toy extends C_Item {

	public D_Toy(double price) {
		super(price);
	}

	@Override
	public void purchase() {
		System.out.println("Item" + this.id + " was purchased. Time to play with our pet!");
	}

}
