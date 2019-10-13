import java.util.*;
class NotEligibleException extends Exception{
        NotEligibleException(String s){
                super(s);
        }
}
class LowMarksException extends Exception{
        LowMarksException(String s){
                super(s);
        }
}
class LowAttendanceException extends Exception{
        LowAttendanceException(String s){
                super(s);
        }
}
public class chainexp {
     public static void main(String args[])
     {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter %attendance and CIE marks: ");
                int attendance = sc.nextInt();
                int CIE = sc.nextInt();
                NotEligibleException e=new NotEligibleException("Not eligible for SEE.");
                try{
                        if(attendance<80){
                                e.initCause(new LowAttendanceException("Attendance less than 80%: "+attendance+"%"));
                                throw e;
                        }
                        else if(CIE<20){
                                e.initCause(new LowMarksException("CIE marks less than 20: "+CIE));
                                throw e;
                        }
                        else
                            System.out.println("Eligible for SEE.");
                }
                catch(NotEligibleException a){
                        System.out.println(a);
                        System.out.println(a.getCause());
                }
                
        }
}
