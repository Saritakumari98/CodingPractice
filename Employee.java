package codingPracticeTest;

public class Employee {
	String FirstName;
	String LastName;
	

	public Employee(String firstName, String lastName) {
		super();
		FirstName = firstName;  //intilizating instance variable
		LastName = lastName; //intilizating instance variable
	}
    

	@Override
	public String toString() //overriding toString method
	{
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}


	public static void main(String[] args) {
		
      Employee emp1=new Employee("Rahul","Sharma");//intilizating instance variable with value
      System.out.println(emp1);
      
      Employee emp2=new Employee("Sarita","Singh");//intilizating instance variable with value
      System.out.println(emp2);
      
      Employee emp3=new Employee("Mona","Shina");//intilizating instance variable with value
      System.out.println(emp3);
	}

}
