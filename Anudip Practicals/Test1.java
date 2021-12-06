class EncapsulationDemo{
private int i;
private String empName;
private int empAge;
public  int geti(){
return i;
}
public String getempName(){
return empName;
}
public int getempAge(){
return empAge;
}
public void seti(int newvalue){
i=newvalue;}
public void setempName(String newname){
empName=newname;}
public void setempAge(int newage){
empAge=newage;}}
class Test1{
public static void main(String args[])
{
EncapsulationDemo obj=new EncapsulationDemo();
obj.seti(156);
obj.setempName("Mrudul");
obj.setempAge(20);
System.out.println("i value" +obj.geti());
System.out.println("Employee name" +obj.getempName());
System.out.println("Employee age" +obj.getempAge());
}}


