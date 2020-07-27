package q3q4q5q6;

public class Store {
	protected String name;
	protected int monthRent;

	public Store(String name, int monthRent) {

		this.name = name;
		this.monthRent = monthRent;
	}

	public String getName() {
		return name;
	}

	public int getMonthRent() {
		return monthRent;
	}

	public void setMonthRent(int monthRent) {
		this.monthRent = monthRent;
	}

}
