import java.util.*;
class Ifelse
{
public static void main(String args[])
{
Scanner d1=new Scanner(System.in);
System.out.println("Enter the Number");
int i = d1.nextInt();
if(i<50)
System.out.println("Fail");
else
{
   if(i>=50&&i<60)
   System.out.println("D grade");
   else
   {
   if(i>=60&&i<70)
   System.out.println("C grade");
   else
   {
   if(i>=70&&i<80)
   System.out.println("B grade");
   else
   {
   if(i>=80&&i<90)
   System.out.println("A grade");
   else
   {
   if(i>=90&&i<100)
   System.out.println("A+ Grade");
   else
   System.out.println("Invalid input");
   }
   }
   }
   }
   }
   }
}
