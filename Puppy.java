import java.util.Scanner;
public class Puppy
{
public Puppy(String name){
	System.out.println("Name:"+name);
	}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name of dog:");
	String nm= sc.next();
	Puppy x= new Puppy(nm);
}
}