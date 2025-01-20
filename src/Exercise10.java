import java.util.Stack;

public class Exercise10 {
    public static void main(String[] args) {
        //10.	Write a Java program to implement a stack and move the nth element from the top of the stack to the top
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int n = 2;
        int nthElement = stack.get(stack.size() - n);
        stack.remove(stack.size() - n);
        stack.push(nthElement);

        System.out.println("Stack after moving the " + n + "th element to the top:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }

    }

}
