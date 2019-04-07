class Program2
{
public static void main(String[]args)
{
   double num = 50.75;
   long lnum = (int)num;
   double pnum = num - lnum;
   System.out.println("Decimal: " +num);
   System.out.println("Whole Number: " +lnum);
   System.out.println("Point Number: "+pnum );
}
}