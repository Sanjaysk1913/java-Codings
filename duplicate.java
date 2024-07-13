import java.util.*;
class duplicate{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int siz=s.nextInt();
        int[] arr=new int[siz];
        int i,j,dupno=0,count=0;
        try{
        for(i=0;i<siz;i++)
        arr[i]=s.nextInt();
        for(i=0;i<siz;i++){
            for(j=0;j<siz;j++){
                if(arr[i]==arr[j]&&j!=i){
                dupno=arr[i];
                count++;
            }}
        }
        int a=count/0;
    }
        catch(Exception e){
        if(count>0)
         System.out.printf("Duplicate Number found %d",dupno);
         else
         System.out.print("No Duplicate numbers");
        }
    }
    
}