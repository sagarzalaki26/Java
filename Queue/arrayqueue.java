
public class arrayqueue {

    static class Queue {

        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data){
            if(rear==size-1){
                System.out.println("full queue");
                return;
            }

            rear++;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int front=arr[0];

            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;

            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front=arr[0];
            return front;
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

   

            while(!q.isEmpty()){
                System.out.println("Top is:"+q.peek());
                System.out.println("Remove is:"+q.remove());
            }

            System.out.println("queue is empty");

    }

}
