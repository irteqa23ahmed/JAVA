import java.util.Scanner;

interface EncryptDecrypt
{
  void Encrypt(int v1,int v2);
  void Decrypt(int v1,int v2);
}

class Encrypt_Number implements EncryptDecrypt
{
  private int Number;
  public Encrypt_Number(int Number)
  {
    this.Number=Number;  
  }
  @Override
  public void Encrypt(int v1,int v2)
  {
    int m,res,i;  
    if(v1==1) 
    {
      m=Number;
      res=0;
      i=1;
      while(m!=0)
      {
        res+=((m%10+v2)%10)*i;
        i*=10;
        m=m/10;
      }
      Number=res;
    }
    else
    {
      m=Number;
      res=0;
      i=1;
      while(m!=0)
      {
        if((m%10-v2)<0)
        res+=(10+m%10-v2)*i;
        else
        res+=(m%10-v2)*i;
        i*=10;
        m=m/10;
      }
      Number=res;
    }
  }
  @Override
  public void Decrypt(int v1,int v2)
  {
    if(v1==1)  
    Encrypt(2,v2);
    else
    Encrypt(1,v2);    
  }
  public void print()
  {
    System.out.println("The number is "+Number);  
  }
}

class Encrypt_Message implements EncryptDecrypt
{
  private String Message;
  public Encrypt_Message(String Message)
  {
    this.Message=Message;  
  }
  @Override
  public void Encrypt(int v1,int v2)
  {
    int i,n,v;
    char ch;
    String res="";      
    n=Message.length();
    
    if(v1==1)
    {      
      for(i=0;i<n;++i)
      {
        ch=Message.charAt(i);
        if(Character.isUpperCase(ch))
        {
          v=((ch-'A'+v2)%26);
          ch=(char)('A'+v);
          res+=(ch+"");
        }  
        else
        {
          v=((ch-'a'+v2)%26);
          ch=(char)('a'+v);
          res+=(ch+"");
        }
      }
    }
    else
    {
      for(i=0;i<n;++i)
      {
        ch=Message.charAt(i);
        if(Character.isUpperCase(ch))
        {
          v=ch-'A'-v2;
          if(v>=0)
          ch=(char)('A'+v);
          else
          ch=(char)('Z'+v+1);          
          res+=(ch+"");
        }
        else
        {
          v=ch-'a'-v2;
          if(v>=0)
          ch=(char)('a'+v);
          else
          ch=(char)('z'+v+1);
          
          res+=(ch+"");   
        }
      }
    }
    Message=res;
  }
  
  @Override
  public void Decrypt(int v1,int v2)
  {
    if(v1==1)  
    Encrypt(2,v2);
    else
    Encrypt(1,v2);   
  }
  public void print()
  {
    System.out.println("The message is "+Message);  
  }
}

public class encdec
{
  public static void main(String args[])
  {
    int num;
    String s;
    Scanner in=new Scanner(System.in);
    
    System.out.println("Enter a number:");
    num=in.nextInt();
    in.nextLine();
    
    Encrypt_Number o1=new Encrypt_Number(num);
    o1.print();
    o1.Encrypt(2,3);
    o1.print();
    o1.Decrypt(2,3);
    o1.print();

    System.out.println("Enter a message:");
    s=in.nextLine();
    
    Encrypt_Message o2=new Encrypt_Message(s);
    o2.print();
    o2.Encrypt(1,3);
    o2.print();
    o2.Decrypt(1,3);
    o2.print();
  }
}
