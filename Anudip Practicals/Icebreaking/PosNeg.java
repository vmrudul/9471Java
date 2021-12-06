//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.*;
public class PosNeg{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.print("Enter no.: ");
int input=in.nextInt();
if(input>0)
{System.out.println("Number is positive");
}
else if(input<0)
{
System.out.println("Number is Negative");
}
else{
System.out.println("Number is zero");}
}}
