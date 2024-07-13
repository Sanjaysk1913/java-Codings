import java.util.*;
class Linkedlist9{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    Linkedlist9(){
        head = null;
    }//insert at end
    public void insertend(int val){
        Node newnode = new Node(val);
        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;       
            }
            temp.next = newnode;
        }
    }
    public void insertbegin(int s){
        Node newnode = new Node(s);
        if (head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode; 
        }
    }
    public void position(int pos , int k){
        Node newnode = new Node(k);
        Node temp = head;
        for (int i =1;i<pos-1;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist9 list = new Linkedlist9();
        System.out.println("Enter a size:");
        int m = sc.nextInt();
        System.out.println("Enter an element:");
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        System.out.println("Listed Element:");
        list.display();
        System.out.println("\nEnter a Begin Value:");
        int s =sc.nextInt();
        list.insertbegin(s);
        list.display();
        System.out.println("\nEnter a Position:");
        int pos=sc.nextInt();
        System.out.println("Enter a Key value:");
        int k=sc.nextInt();
        list.position(pos, k);
        list.display();
    }
}
