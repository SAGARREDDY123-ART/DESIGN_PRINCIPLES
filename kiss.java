//PROGRAM TO FIND OUT THE 10 EVEN NUMBERS
import java.util.*;
import java.lang.*;
class even
{
 void display(int i)
 {
  if(i%2==0)
  System.out.println("even is "+i);
 }
}
 class kiss
{
 public static void main(String args[])
{
 even a=new even();
 Scanner s=new Scanner(System.in);
 int b;
 for(int i=2;i<=20;i++)
 {
  a.display(i);
 }
}
}
  
  
  
