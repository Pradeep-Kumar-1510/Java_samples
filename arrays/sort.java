class sort{
	public static void main(String[] args){
		int[] arr = new int[]{76,55,-99,-12,0,66,84,25,7,-6};
		
		System.out.println("The given array is :");
		
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
		
		System.out.println();
		System.out.println("Sorted array is :");
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
				int temp=0;
				
				if(arr[i]>arr[j]){	
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i] +" ");
		}
	}
}