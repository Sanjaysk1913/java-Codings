/*
 * n=10 1 2 3 4 6 7 8 9 10 because i==5.
 * so the loop is pass and continue
 */
import java.util.*;
public class loop_control_or_continue {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        System.out.println("Enter the Iteration:");
        for (int i = 1; i <= n; i++)
        {
            if(i==5)
            continue;
            System.out.println(i);   
        }
    }
}
