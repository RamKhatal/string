package pkg1;

import java.util.Scanner;

public class newstring {


	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter name\n");
//	  	scan.nextLine();

//	String name = "ram KHATAL";
//	String Channel = "Dhandarphal";
//	System.out.println(name);
//	System.out.println(name.length());
//	System.out.println(name +" from " + Channel);
//	System.out.println(name.toUpperCase());
//	System.out.println(name.toLowerCase());
//	System.out.println(name.contains("KH"));
//	System.out.println(name.charAt(2));
//	System.out.println(name.endsWith("AL"));
//	System.out.println(name.indexOf("T"));
		
//		int num1 = 4, num2 = 7;
//		System.out.println(Math.max(num1, num2));
//		System.out.println(Math.min(num1, num2));
//		System.out.println(Math.abs(36));
//		System.out.println(Math.abs(6));
//		System.out.println(Math.random());
//		System.out.println(4+(8-4)*Math.random());
//		
//		Scanner scan = new Scanner(System.in);
//    	System.out.println("Enter age");
//     	int age = scan.nextInt();
//     	
     	
//    	if-else condition
//     	if(age>20)
//     	{
//     		
//     		System.out.println("you are adult");
//     	} else if(age>5)
//     	{
//     		System.out.println("you are not  a kid");
//     	}
//     	else
//     	{
//     		System.out.println("you are a kid");
//     	}
//	switch stmt in java
//     	switch(age) {
//     	case 12:
//     		System.out.println("you are 12 year old");
//     		break;
//     	case 56:
//     		System.out.println("you are 56 year old");
//     		break;
//     	case 16:
//     		System.out.println("you are 16 year old");
//     	break;
//     	
//     	}
//     	loops
//        int i=0;
//        
//       do {
//        	System.out.println(i);
//        	i+=1;
//        }while(i<100);
		
//		for loop
//		for(int i=0;i<=10;i++)
//		{if(i==2)
//		{
//			continue;
//		}else {
//			System.out.println(i);
//		}
//	}
//		String [] cars = {"ooo","maruti","honda","xuv"};
//		for(String value:cars)
//		{
//			System.out.println(value);
//		}
		
		float num_1,num_2;
		System.out.println("Enter first number:");
		Scanner scan = new Scanner(System.in);
		num_1=scan.nextFloat();
		System.out.println("Enter second number:");
//		Scanner scan2 = new Scanner(System.in);
		num_2=scan.nextFloat();
		System.out.print("you have entered:");
		System.out.print(num_1);
		System.out.print(" and ");
		System.out.println(num_2);
		String prompt = "Enter 0 for Addition,1 for subtraction,2 for multiplication and 3 for division";
		System.out.println(prompt);
		int input = scan.nextInt();
		switch(input) {
		case 0:
			System.out.println("adding these number");
			System.out.println("the result is:");
			System.out.println(num_1 + num_2);
			break;
		case 1:
			System.out.println("subtracting these number");
			System.out.println("the result is:");
			System.out.println(num_1 - num_2);
			break;
		case 2:
			System.out.println("multi these number");
			System.out.println("the result is:");
			System.out.println(num_1 * num_2);
			break;
		case 3:
			System.out.println("div these number");
			System.out.println("the result is:");
			System.out.println(num_1 / num_2);
			break;
		default:
			System.out.println("invalid input");
			break;

		}
 }
}
