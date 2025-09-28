
public class linkedlist {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data){

        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        return;
        }

        Node currnode=head;

        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newNode;
    }

    public void printlist(){

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+ "->");
            currNode=currNode.next;
        }

        System.out.println("NUll");

    }

    public static void main(String[] args) {
        linkedlist l1=new linkedlist ();
        l1.addfirst("Sagar");
        l1.addlast("Zalaki");
        l1.addfirst("Sandip");
        l1.printlist();
    }

}
