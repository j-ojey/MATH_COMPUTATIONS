package math;

import java.util.Scanner;

class Addition {
	int i;
	int j;
	int add;

	public int Add(int a, int b) {
		add = a + b;
		return add;

	}

}

class Mulitiplcation {
	int i;
	int j;
	int mul;

	public int Mul(int a, int b) {
		mul = a * b;
		return mul;

	}

}

class Division {
	int i;
	int j;
	int div;

	public int Div(int a, int b) {
		div = a / b;
		return div;
	}
}

public class Arithmetics {

	public static void main(String[] args) {
		System.out.println(("1. Addition"));
		System.out.println(("2. Subtraction"));
		System.out.println(("3. Multiplication"));
		System.out.println(("4. Division"));
		System.out.println("5. Rectangle Perimeter");
		System.out.println("6. Triangle Area");
		System.out.println("7. Circle Area");
		System.out.println("8. Circle Perimeter");
		System.out.println("9. Exit");
		System.out.println("Welcome to Arithmetics, Choose an option:");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		switch (option) {
			case 1:
				System.out.println("Enter first number:");
				int a = sc.nextInt();
				System.out.println("Enter second number:");
				int b = sc.nextInt();
				Addition add = new Addition();
				int results = add.Add(a, b);
				System.out.println("The sum is" + results);
				break;

			default:
				break;
		}

		sc.close();
	}

}
