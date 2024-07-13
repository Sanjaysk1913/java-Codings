import java.util.*;
class Linkedlist8{
    Node head;
    
    class Node{
        int data;
        Node next;
        //Node head;
        
        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    Linkedlist8(){
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
    public void sort(){
        if(head==null || head.next==null)
        return;
        else{
            Node current,index;
            int temp;
            for(current=head;current!=null;current=current.next){
                for(index=current.next;index!=null;index=index.next){
                    if(current.data>index.data){
                        temp=current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                }
            }
        }
    }
    public void dup(){
        Node current=head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current = current.next;
            }
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
        
        for (int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void deletebegin(int pos, int k){
        head = head.next;
    }
    public void deleteposition(int d){
        Node temp = head;
        Node prev = null;
        
        for(int i=1;i<d;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
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
        Linkedlist8 list = new Linkedlist8();
        for(int i=1;i>0;i++){
        
            int val = sc.nextInt();
            if(val==(-1))
            break;
            list.insertend(val);
        
    }
        list.sort();
        System.out.println("enter a  insert position");
        int pos=sc.nextInt();
        System.out.println("inset key value");
        int k=sc.nextInt();
         /*int pos = 2;
         int k = 125;
         list.position(2,125);*/
         int d=sc.nextInt();
         System.out.println("entre a delete position");
         list.deleteposition(d);
         System.out.println("enter a key value");
        list.position(pos,k);
        int s =sc.nextInt();
        System.out.println("enter a begining value");
        list.insertbegin(s);
       list.dup();
       list.display();
        
        
    }
  
}