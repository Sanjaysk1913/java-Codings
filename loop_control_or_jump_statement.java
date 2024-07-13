/*
 * Jump statements - break
 * 
 * For a given n,find the nearest number divisible by 10 that is less than or equal to n
 * 
 * 78-70
 * 88-80
 * 99-90
 */
import java.util.*;
public class loop_control_or_jump_statement {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        while(n>=0){
            if(n%10==0)
            {
                System.out.println(n);
                break;
            }
            n--;
        }
    }
}
