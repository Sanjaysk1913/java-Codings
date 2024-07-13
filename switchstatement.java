import java.util.*;
public class switchstatement {
    public static void main(String[] args) {
        //int num1,num2;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1=obj.nextInt();
        System.out.println("Enter Second Number:");
        int num2=obj.nextInt();
        char operator;
        System.out.println("Enter the Operator +,-,*,/ or % : ");
        operator=obj.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 +" = " + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 +" = " + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 +" = " + (num1*num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 +" = " + (num1/num2));
                break;
            case '%':
                System.out.println(num1 + " - " + num2 +" = " + (num1%num2));
                break;            
            default:
            System.out.println("***You have enter incorrect operator***");
        }
    }
}
