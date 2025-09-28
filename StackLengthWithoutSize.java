
// import java.util.Stack;


        
// //         Stack stk=new Stack();

// //        stk.push('1');
// //        stk.push("12");

// //        System.out.println(stk);
// //        while(!stk.isEmpty()){
        
       
// //        stk.pop();
// //        }
// //        System.out.println(stk);
       
// //     }

// // }

// public class ar{
//     public static void main(String[] args) {
//        Stack<Integer> stk=new Stack<>();

//        stk.push(120);
//        stk.push(4);
       
//        stk.push(1);
       
//        stk.push(220);

// //        if(stk.size()==4){
// //         stk.pop();
// // System.out.println("1 c:"+stk);
    
// //        }
// //        else if(stk.size()<3){
// //             stk.push(24);
// //             System.out.println("2 c:"+stk);
// //        }

// //        else{

// //         System.out.println(stk);
// //        }

//         int length = getLength(stk);
//     }

//    static int getLength(Stack<Integer> stack) {
//         Stack<Integer> temp = new Stack<>();
//         while(!Stack.isEmpty()){

//         }
   
//    }

import java.util.Stack;

public class StackLengthWithoutSize {

    // ✅ Define getLength() as static or inside the main class
    static int getLength(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        int count = 0;

        while (!stack.isEmpty()) {
            temp.push(stack.pop());
            count++;
        }

        // Restore the original stack
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return count;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        int length = getLength(stack); // ✅ now this works!
        System.out.println("Length of stack: " + length);
        System.out.println("Stack after counting: " + stack);
    }
}
