class PositionofNum{
	public static void main(String[]args){
	int val;
	val=Integer.parseInt(args[0]);
	int[]arr={2,8,9,5,3};
	Boolean found=false;
	for(int n:arr)
	found=true;
	if(found){
	System.out.println("Number is found:"+val);
	}
	else{
	System.out.println("Number is not found:");
	}
	for(int i=0;i<=arr.length;i++){
	System.out.println("Position of num is:"+arr[i]);
	}


	}
}