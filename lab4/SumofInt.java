import java.util.Scanner;
class SumofInt{
	public static void main(String[]args){
	int n;
	int a=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter num:");
	n=s.nextInt();
	for(int x=1;x<=n;x++){
	a=a+n;
	}
	System.out.println("Sum of first"+ " " +n+"nat.num is"+" "+a);
	}
	
}