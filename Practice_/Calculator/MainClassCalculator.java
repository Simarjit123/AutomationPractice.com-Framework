import java.util.Scanner;

public class MainClassCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		System.out.println("choose one function:");
		String function = sc.next();
		switch (function) {
		case "addition":
			System.out.println("addition of two numbers is:" + calculator.addTwoNumbers(num1, num2));
			break;
		case "subtraction":
			System.out.println("subtraction of two numbers is:" + calculator.substractTwoNumbers(num1, num2));
			break;
		case "multiply":

			System.out.println("multiplication of two numbers is:" + calculator.multiplyTwoNumbersS(num1, num2));
			break;
		case "divide":
			System.out.println("Division of two numbers is:" + calculator.divideTwoNumbers(num1, num2));
			break;
		default:
			System.out.println("please enter valid function");
		}

	}
}