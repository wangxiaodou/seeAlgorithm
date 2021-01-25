import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(124);
        stack.peek(); // 仅仅取出当前元素
        stack.pop(); // 弹出并且删除
        stack.isEmpty();// 判断是否为空
        stack.empty();// 判断是否为空
    }
}
