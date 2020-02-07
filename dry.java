//eaxample for a dry clean code
//area and perimeter of a square
import java.util.*;
class rect
{
 int a;
 int area()
 {
  perimeter(); 
    return (a*a);
 }
void perimeter()
 {
  System.out.println("perimeter "+(4*a));
  
 }
}
class dry
{
 public static void main(String args[])
{
 rect b=new rect();
 Scanner s=new Scanner(System.in);
System.out.println("enter side");
b.a=s.nextInt();
System.out.println( "area is "+ b.area());
}
} 
  
