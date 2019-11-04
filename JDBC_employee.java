import java.sql.*;  
import java.io.*;  
class JDBC_employee{  
public static void main(String args[])throws Exception{  
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "lab_7";
	String driver = "com.mysql.jdbc.Driver";
	String userName = "root"; 
	String password = "";
	Class.forName(driver).newInstance();
	conn = DriverManager.getConnection(url+dbName,userName,password);
	System.out.println("Connected to the database");
	
	String create = "CREATE TABLE IF NOT EXISTS EMPLOYEE(ID INT,Fname TEXT,Lname TEXT,Project VARCHAR(20),Salary INT)";
	conn.createStatement().executeUpdate(create);
	System.out.println("Created employee");
	
	String ID,Fname,Lname,Project,Salary;
PreparedStatement ps=conn.prepareStatement("insert into EMPLOYEE values(?,?,?,?,?)");  
Statement stmt = conn.createStatement();  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
do{  
	System.out.println("Enter ID:");  
	ID=br.readLine(); 
	System.out.println("Enter first name:");  
	Fname=br.readLine();  
	System.out.println("Enter last name:");  
	Lname=br.readLine();
	System.out.println("Enter Project:");  
	Project=br.readLine();
	System.out.println("Enter Salary:");  
	Salary=br.readLine();
	
	ps.setString(1,ID);  
	ps.setString(2,Fname);  
	ps.setString(3,Lname);  
	ps.setString(4,Project);  
	ps.setString(5,Salary);
	
	int i=ps.executeUpdate();  
	System.out.println(i+" records added");  
	System.out.println("Do you want to continue: y/n");  
	String s=br.readLine();  
	if(s.startsWith("n")){  
		break;  
	}  
}while(true);

String sql = "SELECT * from EMPLOYEE";
ResultSet rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
	{
		ID     =rs.getString(1);
		Fname  =rs.getString(2);
		Lname  =rs.getString(3);
		Project=rs.getString(4);
		Salary =rs.getString(5);
		
		System.out.println(rs.getRow()+"-"+ID+"  "+Fname+"  "+Lname+"  "+Project+"  "+Salary);
	}
conn.close();  
}}  

