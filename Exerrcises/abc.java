class abc{
	public static void main(String[] args){
		int n=5,j,i,k;
		char ch='A';
		
		for(i=0;i<=n;i++){
			for(k=n-i;k>0;k--)
				System.out.print(" ");
			for(j=0;j<=i;j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
	}
}