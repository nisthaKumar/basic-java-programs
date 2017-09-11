import java.util.Scanner;
import java.io.*;
import java.lang.*;
class Pallindrome
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the string:");
String input= sc.next();
String rev = "";
int length= input.length();
for(int i=length-1;i>=0;i--)
{
rev+= input.charAt(i);
}
System.out.println("Reverse:"+rev);
if(input.equals(rev))
	System.out.println("Pallindrome");
else
	System.out.println("Not pallindrome");
}
}