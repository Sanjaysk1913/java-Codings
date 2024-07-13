import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        boolean[] bool=new boolean[n];
        for(int i=0;i<bool.length;i++)
        {
            bool[i]=true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(bool[i]==true)
            {
                for(int j=i*i;j<n;j=j+i){
                    bool[j]=false;
                }
            }
        }
        for(int i=2;i<bool.length;i++)
        {
            if(bool[i]==true)
            {
                System.out.print(i+" ");
            }
            
        }
    }
}
