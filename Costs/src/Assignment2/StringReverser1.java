package Assignment2;

import java.util.Stack;

public class StringReverser1 {

    public static String reverse(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "Hello";
        System.out.println(reverse(text));
    }
}
