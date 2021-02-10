package codingPracticeTest;

import java.util.Scanner;

public class PersonAge {

	public static void main(String[] args) {
		
		int countchildren=0, countAdult=0, countSencitizen=0; //Declaration and intilization of variable

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size=sc.nextInt();  //This line take input from user for size of array


		int person_Age[]=new int[size];   //This line declare the integer array
		
        System.out.println("Enter Person Age:");
		for(int i=0;i<person_Age.length;i++)
		{
			person_Age[i]=sc.nextInt();  //This line take input from user for value of array
		}

		sc.close();
		
		for(int i=0;i<person_Age.length;i++)
		{
			System.out.print(person_Age[i]+" ");
		}
		
         System.out.println();
         
		for(int i=0;i<person_Age.length;i++)
		{
			if(person_Age[i]<18)//This line check whether person_Age[0]<18 or person_Age[1]<18......
			{
				countchildren++; //This line increase the value of countchildren=countchildren+1
			}
			else if(person_Age[i]>=18 && person_Age[i]<=54)
			{
				countAdult++;
			}
			else
			{
				countSencitizen++;
			}
		}


		System.out.println("Children : "+countchildren);
		System.out.println("Adult : "+countAdult);
		System.out.println("Senior Citizen : "+countSencitizen);

	}

}
