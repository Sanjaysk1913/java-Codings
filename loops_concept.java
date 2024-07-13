import java.util.*;
public class loops_concept {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no of count:");
        int count =obj.nextInt();
        int i=1;
       /*  for (i = 1; i <= count; i++) {
            System.out.print(i);
        }*/
       /* while(i <= count) // entry control loop
        {
            System.out.print(i);
            i++;
        }*/
        do {   //exit control loop
            System.out.print(i);
            i++;
        } while (i <= count);
        System.out.println("Outside the Loop is I :"+ i);
    }
}
