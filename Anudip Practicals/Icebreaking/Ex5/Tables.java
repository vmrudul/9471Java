//Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor

import java.util.*;
public class Tables{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.print("Enter  no.: ");
int num1=in.nextInt();
for(int i=1;i<=10;i++){
System.out.println(num1 + "*" +(i) + "=" +(num1*(i)));
}}}
