import java.io.*;
import java.util.*;
class Data 
{
    public boolean flag = true;
    synchronized public void display_java() 
    {
        while(true)
        {   
                while (!flag) 
                {
                    try 
                    { 
                        wait();
                    }
                    catch (Exception e) {}
                }
                flag = false;
                System.out.print("JAVA");
                notify();
            }
    }
    synchronized public void display_programming() 
    {
        while(true){   
                while(flag) 
                {
                    try 
                    { 
                        wait();
                    }
                    catch (Exception e) {} 
                }
                flag = true;
                System.out.println(" PROGRAMMING");
                notify();
        }
    }
}
class jThread extends Thread
{   
    Data obj1;
    jThread(Data obj)
    {
        obj1=obj;
    }
    public void run()
    {
        obj1.display_java();
    }
}
class pThread extends Thread
{   
    Data obj1;
    pThread(Data obj)
    {
        obj1=obj;
    }
    public void run()
    {
        obj1.display_programming();
    }
} 

public class javaprog {
    public static void main(String args[])
    {
	Data obj=new Data();
        jThread t1 =new jThread(obj);
        pThread t2 =new pThread(obj);
        t1.start();
        t2.start();
    }
}
