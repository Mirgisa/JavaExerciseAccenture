import java.util.Stack;

public class Exercise8 {
    public static void main(String[] args){
        //8.	Write a Java program to find the maximum and minimum elements in a stack.
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(2);
        System.out.println("Minimum element in the stack: " + findMin(stack));
        System.out.println("Maximum element in the stack: " + findMax(stack));
        stack.pop();

    }

    public static int findMin(Stack<Integer> stack){
        if(stack.isEmpty()){
            return Integer.MAX_VALUE;
        }
        int min = stack.peek();
        for(int i = stack.size()-1; i>=0; i--){
            if(stack.get(i) < min){
                min = stack.get(i);
            }
        }
        return min;
    }

    public static int findMax(Stack<Integer> stack){
        if(stack.isEmpty()){
            return Integer.MIN_VALUE;
        }
        int max = stack.peek();
        for(int i = stack.size()-1; i>=0; i--){
            if(stack.get(i) > max){
                max = stack.get(i);
            }
        }
        return max;
    }
}
