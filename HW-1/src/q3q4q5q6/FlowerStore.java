package q3q4q5q6;

public class FlowerStore extends Store {
	private int numberOfOrdersPerMonth;

	public FlowerStore(String name, int monthRent, int numberOfOrdersPerMonth) {
		super(name, monthRent);
		this.numberOfOrdersPerMonth = numberOfOrdersPerMonth;
	}

	public int getNumberOfOrdersPerMonth() {
		return numberOfOrdersPerMonth;
	}

	public void setNumberOfOrdersPerMonth(int numberOfOrdersPerMonth) {
		this.numberOfOrdersPerMonth = numberOfOrdersPerMonth;
	}

}
