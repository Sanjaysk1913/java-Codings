import java.util.*;
class bitonic{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int s=sc.nextInt();
  int[] a=new int[s];
  for(int i=0;i<s;i++){
    a[i]=sc.nextInt();
  }
  int n=1,k=1;
  for(int i=0;i<s-1;i++){
    if(a[i]>a[i+1])
     n=0;
    if(a[i]<a[i+1])
    k=0;
  }
  if(n==0||k==0)
  System.out.print("Bitonic");
  else
  System.out.print("Not Bitonic");
  
}
}