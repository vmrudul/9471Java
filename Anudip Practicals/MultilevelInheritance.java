class Animal{
void eat(){
System.out.println("Eating");}
}

class Dog extends Animal{
void bark(){
System.out.println("Bark");}
}

class BabyDog extends Dog{
void weep(){
System.out.println("weeping");}
}

class MultilevelInheritance{
public static void main(String args[]){
BabyDog d=new BabyDog();
d.eat();
d.bark();
d.weep();
}}