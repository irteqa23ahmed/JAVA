class prime extends Thread {
    boolean flag = false;
    prime(){
        super("thread1");
        System.out.println("thread1: "+this);
        start();
    }
    public void run(){
        try{
        int i=2,count=0,flag=0;
        while(i<100){
            for(int j=2;j<i;j++){
            if(i%j==0)
            {
                flag=1;
                break;
            }}
            if(flag==0){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
            flag=0;
            i++;
        }
    }
        catch (InterruptedException e){
            System.out.println("Interrupted "+e);
        }
        System.out.println("Exiting "+Thread.currentThread());
    }
}
class div extends Thread {
    div(){
        super("thread2");
        System.out.println("thread2: "+this);
        start();
    }
    public void run(){
        try{
            for(int i=1;i<=100;i++){
                if(i%2==0 && i%4==0 && i%6==0) {
                    System.out.println(i);
                    Thread.sleep(500);
                }
            }
        }
        catch (InterruptedException e){
            System.out.println("Interrupted "+e);
        }
        System.out.println("Exiting "+Thread.currentThread());
    }
}
public class dualthread {
    public static void main(String args[]){
        prime thread1 = new prime();
        div thread2 = new div();
    }
}
