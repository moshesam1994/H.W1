package q7q8q9;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	private String nameStore;
	private int numberOfEmployees;
	private int numberOfDetailsInStock;
	private int avgOfSalary;
	private ArrayList<Car> cars;

	public Store(String nameStore, int numberOfEmployees, int numberOfDetailsInStock, int avgOfSalary,
			ArrayList<Car> cars) {
		this.nameStore = nameStore;
		this.numberOfEmployees = numberOfEmployees;
		this.numberOfDetailsInStock = numberOfDetailsInStock;
		this.avgOfSalary = avgOfSalary;
		this.cars = cars;
	}

	public int getAverageItemsPerEmployee() {
		return numberOfDetailsInStock / numberOfEmployees;
	}

	public Car getOwner(Person p) {
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).getCarOwner().equals(p)) {
				return cars.get(i);
			}
		}
		return null;
	}

	public String getNameStore() {
		return nameStore;
	}

	public void setNameStore(String nameStore) {
		this.nameStore = nameStore;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfDetailsInStock() {
		return numberOfDetailsInStock;
	}

	public void setNumberOfDetailsInStock(int numberOfDetailsInStock) {
		this.numberOfDetailsInStock = numberOfDetailsInStock;
	}

	public int getAvgOfSalary() {
		return avgOfSalary;
	}

	public void setAvgOfSalary(int avgOfSalary) {
		this.avgOfSalary = avgOfSalary;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	public boolean addcartoStock(Car c) {
		if (numberOfDetailsInStock>cars.size()) {
		cars.add(c);
		return true;
	}
		return false;
	}

}
