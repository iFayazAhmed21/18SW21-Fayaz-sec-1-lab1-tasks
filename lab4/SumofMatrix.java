class SumofMatrix{
	public static void main(String[]args){
	int arr1[][]=new int[][]{{4,7,9},{3,21,12},{8,34,11}};
	int arr2[][]=new int[][]{{12,13,14},{9,10,16},{5,10,4}};
	int sum[][]=new int[3][3];
	for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
	sum[i][j]=arr1[i][j]+arr2[i][j];
	System.out.println("Sum of arrays is:"+sum[i][j]);
	}
	System.out.println();
	}

	}
}