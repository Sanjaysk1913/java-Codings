/*
 * int b[][]=new int[4][];
 * b[0]=new int[5]        //4 one dimensional array is needed but that is cloumns are laterly i can define
 * b[1]=new int[50]
 * b[2]=new int[3]
 * b[3]=new int[90]
 */
public class array {
    public static void main(String[] args) {
  /*int marks[]=new int[6];               // one dimensional array
    marks[0]=90;                           *
    marks[1]=80;                           *
    marks[2]=85;
    marks[3]=96;
    marks[4]=99;
    marks[5]=100;
    //int marks[]={90,80,85,96,99,100};
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);           *
    System.out.println(marks[4]);           * 
    System.out.println(marks[5]);*/        // one dimensional array
    int marks[][]=new int[3][4];        //two dimensional array
    marks[0][0]=85;
    marks[0][1]=95;
    marks[0][2]=91;
    marks[0][3]=89;
    marks[1][0]=86;
    marks[1][1]=87;
    marks[1][2]=99;
    marks[1][3]=88;
    System.out.println(marks[0][2]);
    System.out.println(marks[0][1]);
    System.out.println(marks[0][3]);
    System.out.println(marks[1][2]);   // two dimensional array
    }
}
