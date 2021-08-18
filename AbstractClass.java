import java.util.*;
abstract class Shape
{
	abstract void numberOfSides();
}
class Trapezoid extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Trapezoid have 4 sides");
	}
}
class Triangle extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Triangle have 3 sides");
	}
}
class Rectangle extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Rectangle have 4 sides");
	}
}
class Hexagon extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Hexagon have 4 sides");
	}
}
class mymainclass
{
	public static void main(String args [])
	{
		Trapezoid obj1=new Trapezoid();
		Triangle obj2=new Triangle();
		Rectangle obj3=new Rectangle();
		Hexagon obj4=new Hexagon();
		obj1.numberOfSides();
		obj2.numberOfSides();
		obj3.numberOfSides();
		obj4.numberOfSides();
	}
}	
