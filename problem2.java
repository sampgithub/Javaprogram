package tendemloop;

	import java.util.Scanner;

public class problem2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the maximum number: ");
	        int n = scanner.nextInt();

	        System.out.print("Odd numbers up to " + n + ": ");
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 != 0) {
	                System.out.print(i);
	                if (i < n - 1) {
	                    System.out.print(", ");
	                }
	            }
	        }
	        scanner.close();
	    }
	}
