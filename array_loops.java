import java.util.*;
public class array_loops {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Toatl Subject:");
        int n=obj.nextInt();
        int sum=0;
        int[] marks=new int[n];
        for(int i=0;i<n;i++)
        {
            marks[i]=obj.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum=sum+marks[i];
        }
        System.out.println("Total is"+sum);
        }
    }
