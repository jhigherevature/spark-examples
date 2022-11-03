package b_overriding;

import java.util.Objects;

public class C_Dog extends B_Animal {
	
	boolean hasChewToy;

	public void bark() {
		System.out.println("Woof Woof");
	}

	/** 1. Optionally override hashCode and equals to ensure all properties, 
	 * including dog-specific properties, are being compared */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(hasChewToy);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		C_Dog other = (C_Dog) obj;
		return hasChewToy == other.hasChewToy;
	}

	
	
}
