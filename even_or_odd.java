import java.util.*;
public class even_or_odd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String[] arr={"even", "odd"};
        System.out.println(arr[n%2]);
        
    }
}
