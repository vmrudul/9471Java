//Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39


import.java.util.*;
public class Compare{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int num1;
int num2;
System.out.print("Enter 1st no. ");
num1=input.nextInt();
System.out.print("Enter 2nd no. ");
num2=input.nextInt();

if(num1==num2)
System.out.println(num1 +"==" +num2);

if(num1!=num2)
System.out.println(num1 +"!=" +num2);

if(num1>num2)
System.out.println(num1 +">" +num2);

if(num1<num2)
System.out.println(num1 +"<" +num2);

if(num1<=num2)
System.out.println(num1 +"<=" +num2);

if(num1>=num2)
System.out.println(num1 +">=" +num2);}}
