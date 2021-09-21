package comparisons;

import java.util.Comparator;

/*
 * This class uses the Comparator interface to compare
 * two Data objects based on the value of their id field.
 */
public class IdComparator implements Comparator<Data> {
	@Override
	public int compare(Data o1, Data o2) {
		if (o1.getId() < o2.getId()) {
			return -1;
		} else if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
