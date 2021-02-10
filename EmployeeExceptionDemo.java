package codingPracticeTest;

class NullPointerException extends Exception //custome exception class
{
	String msg;

	public NullPointerException(String msg) {
		super(msg);
		
		
	}
	
	
}

public class EmployeeExceptionDemo {
	private String FirstName;//declaration of private variable
	private String LastName;//declaration of private variable
	
	

	public EmployeeExceptionDemo(String firstName, String lastName) {
		super();
		FirstName = firstName; //intilizing variable
		LastName = lastName;//intilizing variable
	}

  void validation(String FirstName,String LastName ) throws NullPointerException //declaration of exception
  {
	  if(FirstName== null || LastName==null)
	   {
		 throw new NullPointerException("Entry Missing"); //throwing  exception
	   }
	  

	  else if(FirstName.length()<3|| LastName.length()<3)
	   {
		 throw new NullPointerException("Name should be minimum 3 character");//throwing exception
	   }
	  
  }

	public static void main(String[] args) throws NullPointerException {
	
		EmployeeExceptionDemo empdm=new EmployeeExceptionDemo("Rahul", "Sharma");
		  
		  empdm.validation("Ra", "sh");// code which cause exception
	}

}
