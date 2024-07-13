import java.util.*;
public class nested_loops {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no of count:");
        int count =obj.nextInt();
        int i,j;
        for (i = 1; i <= count; i++)
        {
            for (j = 1; j <= count; j++) 
            {
                if(i==3 && j==3)
                break;
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
