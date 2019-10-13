
package equation;

public class Quadratic
{
  private double a,b,c,r1,r2;
  private boolean flag;
  
  public Quadratic(double a,double b,double c)
  {
    this.a=a;
    this.b=b;
    this.c=c;
    r1=r2=0;
    flag=true;
  }
  public void solve()
  {
    if(b*b-4*a*c<0)
    flag=false;  
    else
    {
      r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
      r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }    
  }
  public void print()
  {
    if(flag)  
    System.out.println("The roots are "+r1+" and "+r2); 
    else
    System.out.println("No real roots exist!");    
  }
}

import java.util.Scanner;
import equation.Quadratic;

public class Test
{
  public static void main(String args[])
  {
    double a,b,c;
    Scanner in=new Scanner(System.in);
    
    System.out.println("Enter a,b and c:");
    a=in.nextDouble();
    b=in.nextDouble();
    c=in.nextDouble();
    
    Quadratic o=new Quadratic(a,b,c);
    o.solve();
    o.print();
  }
}
