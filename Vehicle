package vehicle;

public class VehicleNumberPlate 
{
  String number;
  public VehicleNumberPlate(String number)
  {
    this.number=number;
  }
  public boolean check()
  {
    String s[]=number.split(" ");
    
    if(s.length!=4)
    return false;    
    else
    {
      if(s[0].length()!=2)
      return false;
      else
      {
        if(!(Character.isUpperCase(s[0].charAt(0))&&Character.isUpperCase(s[0].charAt(1)))) 
        return false;
        else
        {
          if(s[1].length()!=2)
          return false;
          else
          {
             if(!(Character.isDigit(s[1].charAt(0))&&Character.isDigit(s[1].charAt(1))))
             return false;
             else
             {
               if(!(s[2].length()==2||s[2].length()==1))
               return false;
               else
               {
                 if(s[2].length()==2)
                 {
                   if(!(Character.isDigit(s[2].charAt(0))||Character.isUpperCase(s[2].charAt(0))&&(Character.isUpperCase(s[2].charAt(1)))))
                   return false;
                 }    
                 if(s[2].length()==1)
                 {
                   if(!(Character.isUpperCase(s[2].charAt(0))))
                   return false;
                 }
                 
                 if(s[3].length()!=4)
                 return false;
                 else
                 {
                   int i;
                   for(i=0;i<4;++i)
                   if(!(Character.isDigit(s[3].charAt(i))))
                   return false;
                     
                   return true;
                 }    
                     
               }
             }     
          }
        } 
      }
    }
  }
}

import java.util.Scanner;
import vehicle.*;

public class Test
{
  public static void main(String args[])
  {
    String s;
    Scanner in=new Scanner(System.in);
    
    System.out.println("Enter vehicle number:");
    s=in.nextLine();
   
    VehicleNumberPlate p=new VehicleNumberPlate(s);
    
    if(p.check())
    System.out.println("Correct Number");  
    else
    System.out.println("Incorrect Number");    
  }
}

