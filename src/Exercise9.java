import java.util.Stack;

public class Exercise9 {
    public static void main(String[] args){
        //9.	Write a Java program to swap the top two elements of a given stack.
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        swapTopTwoElements(stack);
        System.out.println("Swapped Stack: " + stack);
    }

    public static void swapTopTwoElements(Stack<Integer> stack){
        if(stack.size() < 2) {
            System.out.println("Stack must have at least 2 elements to swap");
            return;
        }

        int temp = stack.pop();
        int temp2 = stack.pop();

        stack.push(temp);
        stack.push(temp2);
    }
}
