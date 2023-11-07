package math;

class Addition{
	int i;
	int j;
	int add;
	
	public int Add(int a, int b){
		add=a+b;
		return add;
		
	}
	
}

public class Arithmetics {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Addition sum = new Addition();
		System.out.println(sum.Add(1, 0));
		

	}

}
