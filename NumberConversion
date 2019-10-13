package NumberConversion;

public class Class1 
{
  private String num;
  private boolean decflag;
  
  public Class1(String num)
  {
    this.num=num;
    decflag=true;
  }
  
  public void toBin()
  {
     if(decflag) 
     {
       int d,b,i;
     
       d=Integer.parseInt(num);
     
       i=1;
       b=0;
       while(d!=0)
       {
         b+=(d%2)*i;
         d/=2;
         i*=10;
       }
     
       decflag=false;
       num=Integer.toString(b);
     }
  }
  
  public void toDec()
  {
    if(!decflag)
    {
      int n,d,i,j;
    
      n=num.length();
      d=0;
   
      for(i=n-1,j=1;i>=0;--i,j*=2)
      if(num.charAt(i)=='1')
      d+=j;
    
      decflag=true;
      num=Integer.toString(d);
    }
  }
  
  public void print()
  {
    System.out.println("Number is "+num);  
  }
  
}


package NumberConversion;

public class Class2 
{
  private String num;
  private boolean decflag;
  
  public Class2(String num)
  {
    this.num=num;
    decflag=true;
  }
  
  public void toOct()
  {
     if(decflag)
     {
       int d,o,i;
       d=Integer.parseInt(num);
     
       i=1;
       o=0;
       while(d!=0)
       {
         o+=(d%8)*i;
         d/=8;
         i*=10;
       }
   
       decflag=false;
       num=Integer.toString(o);
    }
  }
  
  public void toDec()
  {
    if(!decflag)
    {
      int n,d,i,j;
   
      n=num.length();
      d=0;
   
      for(i=n-1,j=1;i>=0;--i,j*=8)
      d+=Integer.parseInt(num.charAt(i)+"")*j;
   
      decflag=true;
      num=Integer.toString(d);
    }
  }
  
  public void print()
  {
    System.out.println("Number is "+num);  
  }
}

package NumberConversion;

public class Class3 
{
  private String num;
  private boolean decflag;
  
  public Class3(String num)
  {
    this.num=num;
    decflag=true;
  }
  
  public void toHex()
  {
     if(decflag)
     {
       int d,n,i;
       String h="";
     
       d=Integer.parseInt(num);
     
       while(d!=0)
       {
         if(d%16<10)
         h+=Integer.toString(d%16);
         else
         {
           switch(d%16)
           {
             case 10:h+="A";
                     break;
             case 11:h+="B";
                     break;
             case 12:h+="C";
                     break;
             case 13:h+="D";
                     break;
             case 14:h+="E";
                     break;
             case 15:h+="F";
                     break; 
           } 
         }
         d/=16;
       }
     
       num="";
       n=h.length();
       for(i=n-1;i>=0;--i)
       num+=(h.charAt(i)+"");
       
       decflag=false;
    }
  }
  
  public void toDec()
  {
    if(!decflag)
    {
      int n,d,v,i,j;
    
      n=num.length();
      d=0;
   
      for(i=n-1,j=1;i>=0;--i,j*=16)
      {
        switch(num.charAt(i))
        {
          case '0':
          case '1':
          case '2':
          case '3':
          case '4':
          case '5':
          case '6':
          case '7':
          case '8':
          case '9': v=Integer.parseInt(num.charAt(i)+"");
                    d+=v*j; 
                    break;
          case 'A': d+=10*j;
                    break;
          case 'B': d+=11*j;
                    break; 
          case 'C': d+=12*j;
                    break; 
          case 'D': d+=13*j;
                    break;
          case 'E': d+=14*j;
                    break;  
          case 'F': d+=15*j; 
                    break; 
        }    
      }
  
      decflag=true;
      num=Integer.toString(d);
    }
  }
  
  public void print()
  {
    System.out.println("Number is "+num);  
  }
  
}


package test;

import java.util.Scanner;
import NumberConversion.*;

public class Test
{
  public static void main(String args[])
  {
    String s;
    Scanner in=new Scanner(System.in);
    
    System.out.println("Enter a decimal number:");
    s=in.nextLine();
    
    Class1 o1=new Class1(s);
    o1.print();
    o1.toBin();
    o1.print();
    o1.toDec();
    o1.print();
    
    Class2 o2=new Class2(s);
    o2.print();
    o2.toOct();
    o2.print();
    o2.toDec();
    o2.print();

    Class3 o3=new Class3(s);
    o3.print();
    o3.toHex();
    o3.print();
    o3.toDec();
    o3.print();    
  }
}
