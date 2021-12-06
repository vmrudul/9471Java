class Poly
{
 void display(int i)
{System.out.println(i);
}

void display(int i, char a){
System.out.println(i +" "+ a);}}

class Poly1{
public static void main(String args[]){
Poly obj=new Poly();
obj.display(3);
obj.display(4,'a');
}}