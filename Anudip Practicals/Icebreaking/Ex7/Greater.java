//Take three numbers from the user and print the greatest number. 
//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87 

import java.util.*;
public class Greater{
public static void main(String args[]){
Scanner in=new Scanner(System.in);

System.out.print("Enter 1st no.");
int num1=in.nextInt();

System.out.print("Enter 2nd no.");
int num2=in.nextInt();

System.out.print("Enter 3rd no.");
int num3=in.nextInt();
if (num1>num2)
 if(num1>num3)
System.out.println("The greatest no. is: " +num1);

if (num2>num1)
 if(num2>num3)
System.out.println("The greatest no. is: " +num2);

if (num3>num1)
 if(num3>num2)
System.out.println("The greatest no. is: " +num3);}}
