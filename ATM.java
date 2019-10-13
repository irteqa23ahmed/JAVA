import java.util.*;
class DailyTransactionLimitException extends Exception{
        DailyTransactionLimitException(String s){
                super(s);
        }
}

class InsufficientAmountException extends Exception{
        InsufficientAmountException (String s){
                super(s);
        }
}
public class ATM {
    public static void main(String args[]) throws DailyTransactionLimitException, InsufficientAmountException
    { 
                Scanner sc = new Scanner(System.in);
                int balance = 50000;
                while(true){
                System.out.println("Current balance: "+balance);
                System.out.println("Enter amount to withdraw: ");
                int amount = sc.nextInt();
                try{
                        if(amount>balance){
                                throw new InsufficientAmountException("Withdrawal amount more than balance.");
                        }
                        else if(amount>25000){
                                throw new DailyTransactionLimitException("Max daily transaction is 25k.");
                        }
                        else{
                                balance=balance - amount;
                                System.out.println("Successfully withdrawn.\nBalance: "+balance);
                        }
                }
                catch(DailyTransactionLimitException e){
                        System.out.println(e);
                }
                catch(InsufficientAmountException e){
                        System.out.println(e);
                }
        }
    
    }
}
