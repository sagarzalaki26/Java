
import java.util.ArrayList;

public class st2 {

    static class Stack {

        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);

        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek() {
            int top = list.size() ;
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Peek value is:"+s.peek());
        System.out.println("Poped value is:"+s.pop());
        System.out.println("Peek value:"+s.peek());

    }
}
