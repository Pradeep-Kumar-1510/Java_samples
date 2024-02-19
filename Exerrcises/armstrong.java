import java.util.*;
class armstrong{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	
	int temp,n,r;
	int s=0;
	System.out.println("Enter value of n");

	n=sc.nextInt();
	temp=n;
	while(n>0){
		r=n%10;
		n=n/10;
		s=s+(r*r*r);
	}
	if(temp==s)
		System.out.println("It is a armstrong Number");
	else
		System.out.println("It is not a armstrong Number");
} }