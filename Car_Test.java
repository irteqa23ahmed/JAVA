import java.util.Scanner;
class Car
{
	String car_name, car_model,car_color;

	Car(String name, String model, String color)
	{
		car_name = name;
		car_model = model;
		car_color = color;
	}

	public String toString()
	{
		String val = "Name: "+car_name+"\nModel: "+String.valueOf(this.car_model)+"\nColor: "+String.valueOf(this.car_color)+"\n";
		return val;
	}

	void speed()
	{
		System.out.println("Speed: 50kph");
	}

	void printDetails()
	{
		System.out.print(this);
		speed();
	}
}

class FamilyCar extends Car
{
	int number_of_seats, number_of_doors;
	double car_price;
	
	FamilyCar(String name, String model, String color, int seats, int doors, double price)
	{
		super(name,model,color);
		number_of_seats = seats;
		number_of_doors = doors;
		car_price = price;
	}

	public String toString()
	{
		String val = super.toString() + "Number of seats: " + String.valueOf(this.number_of_seats) + "\nNumber of Doors: " + String.valueOf(this.number_of_doors) + "\nPrice: " + String.valueOf(this.car_price) + "\n";
		return val;
	}

	void speed()
	{
		System.out.println("Speed: 50kph");
	}

	void printDetails()
	{
		System.out.print(this);
		speed();
	}
}

class SportsCar extends Car
{
        int number_of_seats, number_of_doors;
        double car_price;

        SportsCar(String name, String model, String color, int seats, int doors, double price)
        {
                super(name,model,color);
                number_of_seats = seats;
                number_of_doors = doors;
                car_price = price;
        }

        public String toString()
        {
                String val = super.toString() + "Number of seats: " + String.valueOf(this.number_of_seats) + "\nNumber of Doors: " + String.valueOf(this.number_of_doors) + "\nPrice: " + String.valueOf(this.car_price) + "\n";
                return val;
        }

        void speed()
        {
                System.out.println("Speed: 100kph");
        }

        void printDetails()
        {
                System.out.print(this);
                speed();
        }
}

public class Car_Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Car\t2.SportsCar\t3.FamilyCar\t4.Exit");
			String name="";
			String model="";
			String color="";
			int doors = -1;
			int  seats=-1;
			double price=-1;
			int ch = sc.nextInt();
			sc.nextLine();
			if (ch!=4)
			{	
				System.out.print("Enter Name: ");
				name = sc.nextLine();
				System.out.print("Enter Model: ");
				model = sc.nextLine();
				System.out.print("Enter color: ");
				color = sc.nextLine();
				if(ch!=1)
				{
					System.out.print("Enter number of seats: ");
					seats = sc.nextInt();
					System.out.print("Enter number of doors: ");
					doors = sc.nextInt();
					System.out.print("Enter price: ");
					price = sc.nextDouble();
					sc.nextLine();
				}
			}
			switch(ch)
			{
				case 1:
				{
					Car car = new Car(name, model, color);
					car.printDetails();
					break;
				}
				case 2:
				{
					SportsCar car = new SportsCar(name, model, color, seats, doors, price);
					car.printDetails();
					break;
				}
				case 3:
				{
					FamilyCar car = new FamilyCar(name, model, color, seats, doors, price);
					car.printDetails();
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