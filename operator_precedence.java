public class operator_precedence {
    public static void main(String[] args) {
       /*int a=10,b=25;
        double c=(a+b*25)/b-15;//priority for operators
        System.out.println(c);*/
        int a=4,b=5;
        a=(a^b);
        b=(a^b);
        a=(a^b);
        System.out.println(a);
        System.out.println(b);
    }
}
