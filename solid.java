//solid princliple
//liskov principle
class circle
{
 void display()
 {
  System.out.println("it is a circle");
}
}
class rect extends circle 
 {
 void print()
 {
 System.out.println("rectangle");
}
}
class solid
{
 public static void main(String args[])
{
 rect a=new rect();
 a.display();
 a.print();
}
}

