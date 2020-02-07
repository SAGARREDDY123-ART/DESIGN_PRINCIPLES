//Implement Calculator Application with Add, Divide, Multiply and Subtract Methods
import java.util.*;
import java.lang.*;
class caculator
{
 int a,b;
 void add()
 {
  System.out.println("the addition is :- "+(a+b));
   sub();
 }
 void sub()
 {
System.out.println("the subtraction is :- "+(a-b));
 div();
}
 void div()
 {
System.out.println("the division is :- "+(a/b));
 mul();
}
 void mul()
 {
System.out.println("the multiplication is :- "+(a*b));
 }
}
class calculator
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 caculator c=new caculator();
 System.out.println("enter the values of a and b");
 c.a=s.nextInt();
 c.b=s.nextInt();
 c.add();
}
}
