public class Pup
{
	int pupAge;
	public Pup(String name)
	{
		System.out.println("Name:"+name);
	}
	public void setAge(int age){
		pupAge=age;
	}
	public int getAge(){
		System.out.println("Pup's age:"+pupAge);
		return pupAge;
	}
	public static void main(String args[]){
	Pup myPup = new Pup("tommy");
	myPup.setAge(5);
	myPup.getAge();
	System.out.println("Puppy's age is:"+myPup.pupAge);
	}
}