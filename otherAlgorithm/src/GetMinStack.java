import java.util.Stack;

public class GetMinStack {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMinStack(){
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }


    public void push(Integer value){

        stackData.push(value);
        if(stackMin.isEmpty()){
            stackMin.push(value);
        }else {
            int minValue = getMin();
            if ( minValue >= value){
                stackMin.pop();
                stackMin.push(value);
            }
        }

    }

    public Integer pop(){
        if( stackData.empty()){
            throw new RuntimeException("Your Stack is Empty");
        }
        int value = stackData.pop();
        while( value == getMin()){
            while(!stackMin.isEmpty()){
                stackMin.pop();
            }
        }

        return value;
    }


    public Integer getMin(){

        if(stackMin.isEmpty()){
            throw new RuntimeException("Your Stack is Empty");
        }else{
            return stackMin.peek();
        }
    }
}
