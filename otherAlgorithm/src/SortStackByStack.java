import java.util.Stack;

public class SortStackByStack {

    public void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        if ( stack.isEmpty()) return;

        // 首先遍历一遍当前栈，找出
        while(!stack.isEmpty()){
            int cur = stack.pop();
            while(!help.isEmpty() && help.peek() > cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while(!help.isEmpty()){
            stack.push(help.pop());
        }

    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(56);
        stack.push(36);
        stack.push(45);
        stack.push(37);
        stack.push(37);
        new SortStackByStack().sortStackByStack(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
