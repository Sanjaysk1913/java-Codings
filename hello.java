
import java.util.*;
class hello
{
    public static void main(String[] args)
    {
       /* System.out.println("Hello World");
        System.out.println("\"Hello World\"");*/

        int n; //prime number
        int d=0;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for( int i = 2; i<=n ; i++)
        {
            if(n%i==0)
            {
                d=d+1;
            }
        }
        if(d>=1)
        {
            System.out.println("not");
        }
        else {
            System.out.println("Prime number");
        }
    }
}