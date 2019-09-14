import java.util.*;

class Invoice {
private int item_id;
private String item_name;
private int item_type;
private int item_quantity;
private double item_price;
public static double total=0; 

public void getDetails() {
	System.out.println("Id : "+item_id);
	System.out.println("Name : "+item_name);
	System.out.println("Type : "+item_type);
	System.out.println("Quantity : "+item_quantity);
	System.out.println("Price : Rs."+item_price);
}

public void setDetails() {
	Scanner scan = new Scanner(System.in);
	Scanner line = new Scanner(System.in);
	System.out.println("Id : ");
	item_id = scan.nextInt();
	System.out.println("Name : ");
	item_name = line.nextLine();
	System.out.println("Type : ");
	item_type = scan.nextInt();
	System.out.println("Quantity : ");
	item_quantity = scan.nextInt();
	System.out.println("Price : Rs.");
	item_price = scan.nextDouble();
}

public double calculateTax(int type,double price)
{double per;
switch(type) {
case 1: per=5;break;
case 2: per=12;break;
case 3: per=18;break;
case 4: per=28;break;
default : per=2;
}
return item_price*(per/100.0);
}

public void printInvoice()
{
double gst;
gst = calculateTax(item_type,item_price);
System.out.println("GST        : Rs."+gst*item_quantity);
gst = (item_price+gst);
System.out.println("Total       : Rs."+gst*item_quantity);
total += gst*item_quantity;
}
}

public class invoice {
public static void main(String[] args) {
Invoice cart[] = new Invoice[5];
for(int i=0;i<5;i++){
cart[i] = new Invoice();
cart[i].setDetails();
cart[i].getDetails();
cart[i].printInvoice();
}
System.out.println("Total Bill amount : Rs."+Invoice.total);
}}
