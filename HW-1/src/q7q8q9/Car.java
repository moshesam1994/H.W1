package q7q8q9;

public class Car {
	private String licenseNumber;
	private String modelCar;
	private String color;
	private Person carOwner;

	public Car(String licenseNumber) {
		this.licenseNumber = licenseNumber;

	}

	public Car() {
		this.licenseNumber = "0000000";

	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public String toString() {
		return "Car [licenseNumber=" + licenseNumber + ", modelCar=" + modelCar + ", color=" + color + ", carOwner="
				+ carOwner + "]";
	}

	public Person getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(Person carOwner) {
		this.carOwner = carOwner;
	}
	
public static void main(String[] args) {
	Car c=new Car();
	Car c2=new Car("0");
	System.out.println();
	c.setModelCar("nizan");
	System.out.println(c.toString());
}
}
