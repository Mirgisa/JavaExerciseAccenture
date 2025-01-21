import java.util.Stack;

public class Exercise11 {
    public static void main(String[] args){
        //11.	Write a Java program that implements a stack and creates a new stack from a portion of the original stack.
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Stack<Integer> newStack = new Stack<>();
        for(int i = 2; i < 5; i++){
            newStack.push(stack.pop());
        }

        System.out.println("Original stack: " + stack);
        System.out.println("New stack: " + newStack);
    }
}
