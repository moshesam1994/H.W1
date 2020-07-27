package q7q8q9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Person[] create3Person(Scanner s) {
		Person[] p = new Person[3];
		String name, address;
		int id, age, salary;

		for (int i = 0; i < p.length; i++) {
			System.out.println("Enter name");
			name = s.next();
			System.out.println("Enter id");
			id = s.nextInt();
			System.out.println("Enter age");
			age = s.nextInt();
			System.out.println("Enter salary");
			salary = s.nextInt();
			System.out.println("Enter address");
			address = s.next();
			p[i] = new Person(name, id, age, salary, address);
		}
		return p;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		create3Person(s);
		Store s1 = new Store("aoto", 10, 15, 5000, selctCars(s));
		findNumerCarModelNissan(s1);
		
	}

	public static void findNumerCarModelNissan(Store s1) {
		int cuonter = 0;
		for (int i = 0; i < s1.getCars().size(); i++) {
			if (s1.getCars().get(i).getModelCar().equals("nissan")) {

				cuonter++;
			}
		}
		System.out.println("The number of cars with the name nissan is:" + cuonter);
	}

	private static ArrayList<Car> selctCars(Scanner s) {
		String str;
		String str1 = "0";
		ArrayList<Car> cars = new ArrayList<Car>();
		do {
			System.out.println("Enter number licenseNumber to creat car,\nEnter 0 to Exit:");
			str = s.nextLine();
			cars.add(new Car(str));
		} while (!str.equals(str1));
		return cars;
	}

}

/*
 * ידוע כי קיימים בעולם רק 3 מודלים של רכבים: אופל, ניסאן ובמוו עליכם ליצור חנות
 * שאליה יוכנס רכבים אלו ( במערך הרכבים של החנות ). עליכם לשבץ את 3 האנשים
 * שקיבלתם מהמשתמש כבעליי הרכבים ( לכל רכב יכול להיות רק בעל אחד, אך לכל בעל
 * יכול להיות מספר רכבים ). עליכם לרוץ במערך שיבדוק וידפיס את כמות הרכבים תחת
 * המודל ניסאן.
 * 
 */
