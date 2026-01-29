package Assignment2;

import java.util.Stack;

public class StackSorter {

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int x = stack.pop();
            while (!temp.isEmpty() && temp.peek() > x) {
                stack.push(temp.pop());
            }
            temp.push(x);
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println(sortStack(stack));
    }
}
