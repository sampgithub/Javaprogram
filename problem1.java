package tendemloop;
	import java.util.Scanner;
	public class problem1 {

	    private double a;
	    private double b;
	    private String operation;

	    public problem1(double a, double b, String operation) {
	        this.a = a;
	        this.b = b;
	        this.operation = operation.toLowerCase();
	    }
	    public String calculate() {
	        switch (operation) {
	            case "add":
	                return "Result: " + (a + b);
	            case "subtract":
	                return "Result: " + (a - b);
	            case "multiply":
	                return "Result: " + (a * b);
	            case "divide":
	                if (b != 0) {
	                    return "Result: " + (a / b);
	                } else {
	                    return "Division by zero";
	                }
	            default:
	                return "Unsupported operation";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter value for a: ");
	            double a = scanner.nextDouble();

	            System.out.print("Enter value for b: ");
	            double b = scanner.nextDouble();

	            scanner.nextLine(); 
	            System.out.print("Enter operation (add, subtract, multiply, divide): ");
	            String operation = scanner.nextLine();

	            problem1 calc = new problem1(a, b, operation);
	            System.out.println(calc.calculate());

	        } catch (Exception e) {
	            System.out.println("Invalid input. Please enter numeric values for a and b.");
	        } finally {
	            scanner.close();
	        }
	    }
	}
