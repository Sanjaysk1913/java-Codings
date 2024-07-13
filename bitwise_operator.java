/*bitwise operstors
   ~ NOT           << left shift
   & AND           >> right shift
   | OR            >>> right shift zero fill
   ^ EXOR
*/
/*public class bitwise_operator{
   public static void main(String[] args) {
       int a=8,b=9;
       int c=a&b;
       System.out.println("a&b is"+c);
       c=a|b;
       System.out.println("a|b is"+c);
       c=a^b;
       System.out.println("a^b is"+c);
   }
}*/
public class bitwise_operator{
   public static void main(String[] args) {
      int a=-4,b=4,c=4;
      System.out.println(a<<1);
      System.out.println(b>>1);
      System.out.println(c>>>1);
   }
}