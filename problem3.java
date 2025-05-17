package tendemloop;
	import java.util.Scanner;
	public class problem3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number (a): ");
	        int a = scanner.nextInt();

	        int count = (a % 2 == 0) ? a - 1 : a; // Use a-1 if even, else a

	        System.out.print("Output: ");
	        for (int i = 0; i < count; i++) {
	            int odd = 2 * i + 1;
	            System.out.print(odd);
	            if (i < count - 1) {
	                System.out.print(", ");
	            }
	        }

	        scanner.close();
	    }
	}
