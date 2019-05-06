import java.util.Scanner;
class Table{
	public static void main(String[]args){
	int st;
	int ed;
	int t;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter table:");
	t=s.nextInt();
	System.out.println("Enter Starting point of table:");
    st=s.nextInt();
    System.out.println("Enter Ending point:");
    ed=s.nextInt();
    int ans;
    for(int i=st;i<=ed;i++){
    ans=t*i;
    System.out.println(t+"x"+i+"="+ans);
    }

	}
}