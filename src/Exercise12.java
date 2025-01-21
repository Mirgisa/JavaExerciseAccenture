import java.util.Stack;

public class Exercise12 {
    public static void main(String[] args){
        //12.	Write a Java program that implements a stack and creates a new stack that contains
        // only elements that are in either the first or the second stack, but not in both.
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        stack2.push(7);

        Stack<Integer> uniqueStack = findUniqueElements(stack1, stack2);
        System.out.println("Unique elements in stack 1 and stack 2: " + uniqueStack);
    }
    public static Stack<Integer> findUniqueElements(Stack<Integer> stack1, Stack<Integer> stack2){
        Stack<Integer> uniqueStack = new Stack<>();
        while(!stack1.isEmpty()){
            int element = stack1.pop();
            if(!stack2.contains(element)){
                uniqueStack.push(element);
            }
        }
        while(!stack2.isEmpty()){
            int element = stack2.pop();
            if(!stack1.contains(element)){
                uniqueStack.push(element);
            }
        }

        return uniqueStack;
    }


}
