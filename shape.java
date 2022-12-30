import java.lang.*;
abstract class shape
{
int a,b;
double area;
final double pi=3.14;
shape(int x,int y)
{
a=x;
b=y;
area=0;
}
abstract void printArea();
}
class Rectangle extends shape
{
Rectangle (int a,int b)
{
super(a,b);
}
void printArea()
{
area = a*b;
System.out.println("Rectangle Area=" + area);
}
}
class triangle extends shape
{
triangle (int a,int b)
{
super (a,b);
}
void printArea()
{
area = (a*b)*(0.5);
System.out.println("triangle area="+area);
}
}
class circle extends shape
{
circle (int a)
{
super (a,-1);
}
void printArea()
{
area = pi*Math.pow(a,2);
System.out.println("circle area="+area);
}
}
class demoshape
{
public static void main(String[] args)
{
Rectangle r=new Rectangle(1,2);
triangle t= new triangle(3,4);
circle c= new circle(5);
shape ref;
ref =r;
ref.printArea();
ref=t;
ref.printArea();
ref=c;
ref.printArea();
}
}
