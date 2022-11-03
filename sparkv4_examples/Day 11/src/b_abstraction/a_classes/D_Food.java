package b_abstraction.a_classes;

/** 1. Create Food class. Do not include purchase() until after interface introduced in base class */
public class D_Food extends C_Item {

	public D_Food(double price) {
		super(price);
	}
	
	@Override
	public void purchase() {
		System.out.println("Item" + this.id + " was purchased. You struck a bargain!");
	}

}
