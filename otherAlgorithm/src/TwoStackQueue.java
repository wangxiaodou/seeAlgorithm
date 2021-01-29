import java.util.Stack;

/**
 * 用两个栈实现队列
 */
public class TwoStackQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue(){
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }
    // 如果压入的话，首先将弹出队列清空
    public void add(Integer value){

        while (!stackPop.isEmpty()){
            stackPush.push(stackPop.pop());
        }
        stackPush.push(value);

    }

    /**
     * 弹出的时候，删除顶部元素
     * @return
     */
    public Integer poll(){
        if (stackPop.isEmpty() && stackPush.isEmpty())
            throw new RuntimeException("Your Queue is Empty");

        while (!stackPush.isEmpty()){
            stackPop.push(stackPush.pop());
        }
        return stackPop.pop();
    }

    public Integer peek(){

        if (stackPop.isEmpty() && stackPush.isEmpty())
            throw new RuntimeException("Your Queue is Empty");

        while (!stackPush.isEmpty()){
            stackPop.push(stackPush.pop());
        }
        return stackPop.peek();
    }

    public static void main(String[] args) {
        TwoStackQueue twoStackQueue = new TwoStackQueue();
        twoStackQueue.add(1);
        twoStackQueue.add(2);
        twoStackQueue.add(3);
        twoStackQueue.add(4);
        twoStackQueue.add(5);

        System.out.println(twoStackQueue.peek());
        System.out.println(twoStackQueue.poll());
        System.out.println(twoStackQueue.poll());
    }
}
