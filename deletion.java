import java.util.Scanner;
public class deletion{
	    Node head;
	    class Node{
	        int data;
	        Node next;
	        Node(int val){
	            data = val;
	            next = null;
	            //head = null;
	        }
	    }
	    deletion(){
	        head = null;
	    }
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
	    public void deletebegin(){
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
        void delete_end(){
            Node temp=head;
           // Node prev = null;
            while(temp.next.next!=null){
               // prev = temp;
                temp=temp.next;
            }
            temp.next=null;
        }
	    public void display(){
	        Node temp = head;
	        
	        while(temp != null){
	            System.out.print(temp.data+"-->");
	            temp = temp.next;
	        }
	        System.out.println("Null");
	    }
	    public static void main(String args[]){
	        Scanner sc = new Scanner (System.in);
	      deletion list = new  deletion();
	       System.out.println("Enter the size:");
	        int m = sc.nextInt();
	         System.out.println("Enter the  elements:");
	        for (int i =0 ;i<m;i++){
	            int val = sc.nextInt();
	            list.insertend(val);
	        }
	         System.out.println("Listed elements:");
	          list.display();
	        list.deletebegin();
	        System.out.println("After deleting the First elements:");
	        list.display();
	         System.out.println("Enter the position element:");
	        int d=sc.nextInt();
	        list.deleteposition(d);
	         System.out.println("After deleting the entered position elements:");
	       list.display();
           list.delete_end();
           System.out.println("After deleting the end elements:");
           list.display();
	    }   
	}