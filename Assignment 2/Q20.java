import java.util.*;
class Q20
{
public static void main(String args[])
{
char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
Scanner sc=new Scanner(System.in);

int r=0;
String h=" ";

System.out.println("enter the number ");
int n=sc.nextInt();
while(n>0)
{
r=n%16;
h=a[r]+h;
n=n/16;
}
System.out.println("hexadecimal number is"+h);
}
}
