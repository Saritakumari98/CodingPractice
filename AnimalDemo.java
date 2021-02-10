package codingPracticeTest;



class Animal {
	
	void shout()
	{
		System.out.println(" Animal sout");
	}

}

class Dog extends Animal// extend Animal class
{
	 void shout() //overriding super class method
		{
			System.out.println(" Bark");
		}
}
class Horse extends Animal// extend Animal class
{
	 void shout() //overriding super class method
		{
			System.out.println(" Neigh ");
		}
}

class Cat extends Animal// extend Animal class
{
	 void shout()  //overriding super class method
		{
			System.out.println(" Mewo Mewo");
		}
}


public class AnimalDemo {

	public static void main(String[] args) {
		Animal dog=new Dog();// object of sub-class using super class reference
		dog.shout();

		Animal horse=new Horse();// object of sub-class using super class reference
		horse.shout();
		
		Animal cat=new Cat();// object of sub-class using super class reference
		cat.shout();
		
	}

}
