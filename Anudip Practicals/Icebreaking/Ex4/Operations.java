//Write a Java program to print the addition, multiply, subtract, divide and remainder of two numbers.

import java.util.*;
public class Operations{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.print("Enter 1st no.: ");
int num1=in.nextInt();
System.out.print("Enter 2nd no.: ");
int num2=in.nextInt();
System.out.println("Addition: " +(num1+num2));
System.out.println("Substraction: " +(num1-num2));
System.out.println("Division: " +(num1/num2));
System.out.println("Multiplication: " +(num1*num2));
}}
