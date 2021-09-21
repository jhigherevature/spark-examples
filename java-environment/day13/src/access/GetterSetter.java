package access;

public class GetterSetter {
	private String name;
	private int id;
	private double weight;
	private String email;
	
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
}
