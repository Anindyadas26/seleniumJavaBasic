package Selenium_Day1;
import java.util.Scanner;

public class ExperimentalMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = createArray(sc);
        displayArray(arr);
        int sum = calculateSum(arr);
        System.out.println("Sum Of All Array Element: " + sum);

        printIndexValue(arr, sc);
        sumTwoIndices(arr, sc);

        sc.close();
    }

    public static int[] createArray(Scanner sc) {
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Value: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
        System.out.println("************");
        System.out.println("These are all your array elements: ");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
        System.out.println("************");
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void printIndexValue(int[] arr, Scanner sc) {
        System.out.print("Enter Array Index To Print Max Within " + arr.length + ": ");
        int index = sc.nextInt();
        System.out.println("************");
        System.out.println("Your Index Output is: " + arr[index]);
        System.out.println("************");
    }

    public static void sumTwoIndices(int[] arr, Scanner sc) {
        System.out.print("Enter 1st Index for Sum: ");
        int sum1 = sc.nextInt();
        System.out.print("Enter 2nd Index for Sum: ");
        int sum2 = sc.nextInt();
        int sumResult = arr[sum1] + arr[sum2];

        System.out.println("************");
        System.out.println("Your Index Addition Output is: " + sumResult);
        System.out.println("************");
    }
}

