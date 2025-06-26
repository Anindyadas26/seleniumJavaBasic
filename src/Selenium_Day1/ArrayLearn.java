package Selenium_Day1;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayLearn {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for (int i = 0; i<size; i++) {
        	System.out.print("Enter Value: ");
        	arr[i] = sc.nextInt();
        	
        	sc.close();	
        }
        
        System.out.println("************");
        System.out.println("These is all your array List ");
        int arraSum = 0;
       // 10, 20, 30, 40, 50
        for (int i = 0; i<size; i++) {
        	System.out.println("Index " + i +": " + arr[i]);
        	arraSum = arraSum + arr[i];
        
        }
        System.out.println("Sum Of All Array Element: " + arraSum);
        System.out.println("************");
        System.out.print("Enter Array Index To Print Max Within " + size + ": ");
        int dex = sc.nextInt();
        System.out.println("************");
        System.out.println("Your Index Output is : " + arr[dex]);
        System.out.println("************");
        System.out.print("Enter 1st Index for Sum : ");
        int sum1 = sc.nextInt();
        System.out.print("Enter 2st Index for Sum : ");
        int sum2 = sc.nextInt();
        int sum3 = arr[sum1] + arr[sum2];
        System.out.println("************");
        System.out.println("Your Index Addition Output is : " + sum3);
        
        
	}
		
}
