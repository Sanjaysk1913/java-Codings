
import java.util.Scanner;

public class loops_concept2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        int sum =0;
        n=obj.nextInt();
        /*for (int i = 1 ; i <= n; i++)
        {
            sum=sum+i; // sum of first n natural numbers
        }
        System.out.print(sum);*/
        for (int i = 1; i <= n; i=i+2)
        {
           sum = sum +i;
        }
        System.out.println(sum);
    }
}
