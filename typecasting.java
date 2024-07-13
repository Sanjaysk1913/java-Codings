/*public class typecasting {
    public static void main(String[] args) {
        byte num1 =10;//1 byte
        int num2;//4 byte
        num2=num1;//automatic type conversion or implicit
        System.out.println(num2);
    }
}*/
public class typecasting {
    public static void main(String[] args) {
        byte num1;//1 byte
        int num2 =10;//4 byte
        num1=(byte)num2;//explicit conversion
        System.out.println(num1);
    }
}
