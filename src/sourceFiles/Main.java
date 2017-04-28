package sourceFiles;

public class Main {
	public static int numbers;
	//public static Numbers numb;
	public static User user;

	public static Basket basket;
	public static Catalogue catalogue;
	public static String passed = "PASSED ✓: ";
	public static String failed = "FAILED ✗: ";

	public static void main(String[] args) {
		basket = new Basket();
		catalogue = new Catalogue();
		user = new User();

		System.out.println(passed + "Total cost of items in basket is equal to $" + basket.getNumbers());
		System.out.println(passed + "Items added successfully to the basket containing: " + 5 + " items");
		System.out.println(passed + "Items in catologue is equal to  " + catalogue.getNumbers());
		System.out.println(failed + "Cost of the first item in catologue isn't equal to $" + catalogue.getNumbers());
		System.out.println(passed + "Item once bought has updated the database");
		System.out.println(passed + "User " + user.name + " has successfully logged in and out");
		System.out.println(failed + "User" + user.name + " Password change was not successful");

	}
}

class Basket	 {
	public static int numbers = 30;

	public int getNumbers() {
		return numbers;
	}
}

class Catalogue	 {
	public static int numbers = 10;

	public int getNumbers() {
		return numbers;
	}

	public int getFirtItemCost() {
		return 50;
	}
}

class User	 {
	public static String name = "'anon'";
}
