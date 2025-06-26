package Selenium_Day2;

import selenium_day1.LearnMethod;

public class DriverTryAndError {

	public static void main(String[] args) {
		//System.out.println(name + ":" + age + ":" + score + ":" + grade);
		//LearnMethod gra = new LearnMethod();
		TryAndError pre = new TryAndError();
		
		int add = pre.sum(10, 20);
		
		System.out.println("Your Index Addition Output is: " + pre.sum(10, 20));
		
		System.out.println("******************");
		
		System.out.println("Your output Addition is: " + add);

	}

}
