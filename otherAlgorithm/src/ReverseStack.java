import java.util.Stack;

/**
 * 用栈以及递归，逆序一个栈
 */
public class ReverseStack {
    // 将stack元素在栈底进行删除

    public static int getAndRemoveLastElement(Stack<Integer> stack){

        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }else{
           int last = getAndRemoveLastElement(stack);
            stack.push(last);
            return last;
        }

    }
    // 逆序一个栈，实现一个reverse,1,2,3,4,5 转化完毕的话，也是 5,4,3,2,1
    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }else{
            int value = getAndRemoveLastElement(stack);
            reverse(stack);
            stack.push(value);
        }

    }
}
