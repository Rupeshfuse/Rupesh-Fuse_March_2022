import java.util.*;
class vowel
{
public static void main(String args[])
{ 
do
{Scanner d1=new Scanner(System.in);
System.out.println("Enter a character "); 
char ch=d1.next().charAt(0);
switch (ch)
{
	
case 'a' :
case 'e' :
case 'i' :
case 'o' :
case 'u':
System.out.println("character is Vowel"); 
break;
default : System.out.println("character is consonant"); 
break;
}
}while(true);
}
}	