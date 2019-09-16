import java.util.Scanner;
class Student_Details
{
	String name;
	int roll_no;
	double []subject = {0.0,0.0,0.0,0.0};
	Student_Details(String n,int r_no, double []s)
	{
		name = n;
		roll_no = r_no;
		for(int i = 0;i < 4;i++)
			subject[i]=s[i];
	}
	void calculateMarks()
	{
		double total_marks = subject[0]+subject[1]+subject[2]+subject[3];
		System.out.println("Total Marks: "+total_marks);
	}
	void calculateMarks(int perc)
        {
                double total_marks = subject[0]+subject[1]+subject[2]+subject[3];
		System.out.println("Marks increased by "+perc+" percent"); 
                System.out.println("Total Marks: "+(total_marks+total_marks*((double)perc/100)));
        }     	        
	void calculateMarks(double perc)
        {
                double total_marks = subject[0]+subject[1]+subject[2]+subject[3];
                System.out.println("Marks increased by "+perc+" percent");
                System.out.println("Total Marks: "+(total_marks+total_marks*(perc/100)));
        } 
	void calculateMarks(int perc1, double perc2)
        {
                double total_marks = subject[0]+subject[1]+subject[2]+subject[3];
                System.out.println("Marks increased by "+(perc1+perc2)+" percent");
                System.out.println("Total Marks: "+(total_marks+total_marks*((perc1+perc2)/100)));
        }
}

public class Student_Detail
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student name: ");
		String name = sc.nextLine();
		System.out.print("Enter Student roll no: ");
		int roll_no = sc.nextInt();
		System.out.print("Enter 4 subject marks: ");
		double []marks = new double[4];
		for(int i = 0;i < 4;i++)
			marks[i] = sc.nextDouble();
		Student_Details st = new Student_Details(name,roll_no,marks);
		int t_flag = 0;
		int nt_flag = 0;
		System.out.println("1 - Participated in technical events\n0 - Not participated");
		t_flag = sc.nextInt();
		System.out.println("1 - Participated in non technical events\n0 - Not participated");
		nt_flag = sc.nextInt();
		if(t_flag==1 && nt_flag==1)
			st.calculateMarks(8,4.5);
		else if(t_flag == 1)
			st.calculateMarks(8);
		else if(nt_flag == 1)
			st.calculateMarks(4.5);
		else
			st.calculateMarks();
	}
}