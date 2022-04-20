package comparisons;

/*
 * This class uses the Comparable interface to compare
 * itself with other data objects. Note that there are comparator
 * objects that also provide comparisons. The Comparable interface
 * is used with certain classes and interfaces (such as the Arrays
 * class) while Comparator is used for other purposes. Note that
 * Comparable and Comparator interfaces are NOT mutually exclusive
 * nor are they dependent on one another. We do NOT need to implement
 * the Comparable interface on this class to create a Comparator for
 * Data objects, nor do we need Comparator objects to use the
 * comparable interface on this class.
 */
public class Data implements Comparable<Data> {
	private int id;
	private double amount;
	
	@Override
	public int compareTo(Data o) {
		if (this.id < o.getId()) {
			return 1;
		} else if (this.id > o.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public Data(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", amount=" + amount + "]";
	}
}
