import java.util.Scanner;
public class inputdemo {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 10 Mark");
        int mark = obj.nextInt();
        System.out.println("Enter the Name");
        String name=obj.nextLine();
        System.out.println("Enter the D.O.B");
        int birth=obj.nextInt();
        System.out.println("Enter the Email");
        String email=obj.nextLine();
        System.out.println("mark");
        System.out.println("name");
        System.out.println("birth");
        System.out.println("email");
    }
}
