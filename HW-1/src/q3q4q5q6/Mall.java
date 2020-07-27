package q3q4q5q6;

import java.util.ArrayList;

public class Mall {
	private ArrayList<Store> arryofStores = new ArrayList<Store>();

	public void addFlowerStore(String name, int monthRent, int numberOfOrdersPerMonth) {
		arryofStores.add(new FlowerStore(name, monthRent, numberOfOrdersPerMonth));
	}

	public void addBookStore(String name, int monthRent, int numberTypesOfBooks) {
		arryofStores.add(new BookStore(name, monthRent, numberTypesOfBooks));
	}

	public void numberOfBookstoresAndHowMachManyHaveToPayForAllRentStores() {
		if (arryofStores.size() != 0) {
			int numberofslowerstores = 0, monthRentOfAllStores = 0;
			for (int i = 0; i < arryofStores.size(); i++) {
				if (arryofStores.get(i) instanceof BookStore) {
					numberofslowerstores++;
				}
				monthRentOfAllStores += arryofStores.get(i).getMonthRent();

			}
			System.out.printf("The number of stores flowers is: %d", numberofslowerstores);
			System.out.println();
			System.out.printf("The rent of all stores is: %d", monthRentOfAllStores);
		}
		System.out.println("Ther has no stores! ");
	}
}