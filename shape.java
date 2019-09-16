import java.util.Scanner;

abstract class Shape
{
	double dim1, dim2;
	
	abstract double calculateArea();

	void displayDetails()
	{
		System.out.println("Area: " + calculateArea());
	}
}

class Rectangle extends Shape
{
	Rectangle(double len, double breadth)
	{
		dim1 = len;
		dim2 = breadth;
	}
	
	double calculateArea()
	{
		return (dim1*dim2);
	}

	void displayDetails()
	{
		System.out.println("Length: " + dim1 + "\nBreadth: " + dim2);
		super.displayDetails();
	}
}

class Triangle extends Shape
{
        Triangle(double base, double height)
        {
                dim1 = base;
                dim2 = height;
        }

	double calculateArea()
	{
		return (0.5*dim1*dim2);
	}

        void displayDetails()
        {
                System.out.println("Base: " + dim1 + "\nHeight: " + dim2);
                super.displayDetails();
        }

}

class Square extends Shape
{
        Square(double side)
        {
                dim1 = side;
                dim2 = side;
        }
	
	double calculateArea()
	{
		return (dim1*dim2);
	}

        void displayDetails()
        {
                System.out.println("Side: " + dim1);
                super.displayDetails();
        }
}

public class shape
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Rectangle\t2.Triangle\t3.Square\t4.Exit");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.print("Enter length and breadth: ");
					double len = sc.nextDouble();
					double breadth = sc.nextDouble();
					Rectangle rect = new Rectangle(len,breadth);
					rect.displayDetails();
					break;
				}
				case 2:
				{
					System.out.print("Enter base and height: ");
					double base = sc.nextDouble();
					double height = sc.nextDouble();
					Triangle tri = new Triangle(base, height);
					tri.displayDetails();
					break;
				}
				case 3:
				{
					System.out.print("Enter side: ");
					double side = sc.nextDouble();
					Square sqr = new Square(side);
					sqr.displayDetails();
					break;
				}
				case 4:
					System.exit(1);
				default:
					System.out.println("Invalid Choice");
			}
		}
	}
}

