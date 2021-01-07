/**
 * 描述: 给定两个整数，不使用加减操作，算出他们的和来
 * 思路： 转化为二进制的进行己算不就可以了么
 * @author bzwxd
 * @create 2019-10-16 16:18
 */
public class SumTwoInteger {

    public int getSumNum(int a,int b) {
        //将十进制数转成字符串，例如n=5 ，s = "101"
       /* Integer aa = Integer.valueOf(Integer.toBinaryString(a)) ;
        Integer bb = Integer.valueOf(Integer.toBinaryString(b)) ;*/
        if (b == 0){
            return a;
        }
        else {
            //进位值
            int carry = (a & b) << 1;
            a = a ^ b;
            return getSumNum(a, carry);
        }


    }
    public static void main(String[] args){
        System.out.println(
                new SumTwoInteger().getSumNum(20,3));
    }
}
