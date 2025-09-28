package array;

 class node {

    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
    
}
 public class linked{
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);

        node temp=head;
        System.out.println("list:");
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
 }
