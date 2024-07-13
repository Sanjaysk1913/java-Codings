import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a Number");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        /*if(num>0) //if else
        {
            System.out.println(num+" Number is Positive");
        }
        else
        {
            System.out.println(num+" Number is Negative");
        } //if else*/
        if(num>0)//elseif
        {
            System.out.println(num+" Number is Positive");
        }
        else if(num==0)
        {
            System.out.println(num+" Number is Neutral");
        }
        else
        {
            System.out.println(num+" Number is Negative");
        }//elseif
    }
}
