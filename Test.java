import java.util.Scanner;

interface DataStructure
{
   void push(int v);
   int pop();
   boolean isEmpty();
   boolean isFull();
}

class Stack implements DataStructure
{
   private int array[];
   private int stackTop,size;
   public Stack(int size)
   {
     array=new int[size];
     stackTop=-1;
     this.size=size;
   }
   @Override
   public void push(int v)
   {
     if(isFull())
     System.out.println("Stack overflow");
     else
     array[++stackTop]=v;   
   }
   @Override
   public int pop()
   {
     if(isEmpty())
     {
       System.out.println("Stack underflow");
       return -1;
     }
     else
     {
       int v=array[stackTop];
       --stackTop;
       return v;
     }    
   }
   @Override
   public boolean isEmpty()
   {
     return (stackTop==-1);   
   }
   @Override
   public boolean isFull()
   {
     return (stackTop==size-1);    
   }
}

class Queue implements DataStructure
{
   private int array[];
   private int front,rear,size;
   public Queue(int size)
   {
     array=new int[size];
     front=rear=-1;
     this.size=size;
   }
  @Override
   public void push(int v)
   {
     if(isFull())
     System.out.println("Queue overflow");
     else
     array[++rear]=v;   
   }
   @Override
   public int pop()
   {
     if(isEmpty())
     {
       System.out.println("Queue underflow");
       return -1;
     }
     else
     {
       int v=array[front+1];
       ++front;
       return v;
     }    
   }
   @Override
   public boolean isEmpty()
   {
     return (front==rear);   
   }
   @Override
   public boolean isFull()
   {
     return (rear==size-1);    
   } 
}

public class Test
{
  public static void main(String args[])
  {
    int n;
    Scanner in=new Scanner(System.in);
    
    System.out.println("Enter the stack size:");
    n=in.nextInt();
    
    Stack s=new Stack(n);
    
    s.push(5);
    s.push(4);
    System.out.println(s.pop());
    System.out.println(s.pop());
   
    
    System.out.println("Enter the queue size:");
    n=in.nextInt();
    
    Queue q=new Queue(n);
    
    q.push(5);
    q.push(4);
    System.out.println(q.pop());
    System.out.println(q.pop());
  }
}
