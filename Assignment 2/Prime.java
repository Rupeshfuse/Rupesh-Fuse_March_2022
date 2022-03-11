import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number ");
{
int i,c=0;
 int n=sc.nextInt();
 for (i=1;i<=n;i++)
 {
 if(n%i==0)
 c++;
 }
if (c==2)
System.out.println(" number is prime ");
else
System.out.println("number is not prime");
}
}
}
