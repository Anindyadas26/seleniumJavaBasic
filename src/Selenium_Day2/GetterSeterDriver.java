package Selenium_Day2;

public class GetterSeterDriver {

	public static void main(String[] args) {
		GetterSetter bmw = new GetterSetter(); // Create and initialize the object
		bmw.setMake("BMW");
		System.out.println("Make of BMW is: " + bmw.getMake());
		
		System.out.println("Model of BMW is: " + bmw.getModel());
		
		GetterSetter benz = new GetterSetter();
		benz.setMake("Benz");
		System.out.println("Make of Benz is: " + benz.getMake());
		
		benz.setModel("c300");
		System.out.println("Model of Benz is: " + benz.getModel());
		
		benz.setYear(1800);
		System.out.println("Year of Benz is: " + benz.getYear());


	}

}
