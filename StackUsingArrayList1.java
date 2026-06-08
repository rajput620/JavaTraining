import java.util.ArrayList;

public class StackUsingArrayList1 {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        // push

        void push(int data) {
            list.add(data);
        }

        // pop 
        int pop () {
            if (list.size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        int peek () {
            if(list.size() == 0) {
                System.out.println("Stack Empty");  
                return -1;
            }
            return list.get(list.size() - 1);   
        }
        void display(){
            System.out.println(list.toString());
        }
    }

    public static void main(String[] args ) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        System.out.println("Peek: " + s.peek());

    }
}