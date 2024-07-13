class Box{
    int length;
    int breath;
    int height;
}
public class class_demo {
    public static void main(String[] args) {
        Box blackBox;
        blackBox=new Box();
        blackBox.length=10;
        blackBox.breath=8;

        Box woodBox=new Box();
        woodBox.height=25;

        System.out.println(blackBox.length);
        System.out.println(blackBox.height);
        System.out.println(blackBox.breath);
        System.out.println(woodBox.height);
    }
}
