import java.util.LinkedList;
import java.util.List;

/**
 * 描述:在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * @author bzwxd
 * @create 2019-10-16 15:39
 */
public class FindRepeatNumber {

    public void findRepeatNumber(int[] numbers){
        List<Integer> newNumber = new LinkedList<>();
        boolean firstOutput = true;
        for (int i = 0; i < numbers.length; i++) {
            if(newNumber.contains(numbers[i])){
                if(firstOutput){
                    System.out.print(numbers[i]);
                    firstOutput = false;
                }
            }else {
                newNumber.add(numbers[i]);
            }
        }
    }

    public static void main(String[] args){
        int[] number = {1,2,3,4,5,6,7,4,5,6,7};
        new FindRepeatNumber().findRepeatNumber(number);
    }
}
