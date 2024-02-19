import java.util.*;
class fact{ 
	static int factorial(int n) 
	{ 
		if (n == 0) 
			return 1; 
		return n * factorial(n - 1); 
	} 

	public static void main(String[] args) 
	{ 
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		num=sc.nextInt();
		
		System.out.println("Factorial of " + num + " is "+ factorial(num)); 
	} 
}
