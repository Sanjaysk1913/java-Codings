/*
 * Jump statements - break
 * 
 * Find the sum of all input numbers entered
 * */
import java.util.*;
public class loop_control_or_jump_statement2 {
    public static void main(String[] args) {
        double n,sum=0.0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Numbers.Enter the Nagative Number to stop:");
        while (true) { 
            n=obj.nextDouble();
            if(n<0.0)
            {
                break;
            }
            sum=sum+n;
        }
        System.out.println("Sum is:0"+sum);
    }
}
