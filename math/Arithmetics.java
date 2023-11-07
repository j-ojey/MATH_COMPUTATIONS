package math;

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
class Division{
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
		System.out.println("Hello World");
		Addition sum = new Addition();
		System.out.println(sum.Add(1, 0));

	}

}
