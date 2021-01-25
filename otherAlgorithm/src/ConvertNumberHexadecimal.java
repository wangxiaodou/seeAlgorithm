/**
 * 描述: 输入一个十进制的数据，转化为16进制的数据
 * @author bzwxd
 * @create 2019-10-16 16:53
 */
public class ConvertNumberHexadecimal {

    StringBuilder stringBuilder = new StringBuilder();

    public static String convertToHexadecimal(int a) {

        if (a / 16 >= 16) {
            if ( a / 16 == 16){
                return convertToHexadecimal(a / 16) + "0";
            }else{
                return convertToHexadecimal(a / 16);
            }
        } else {
            String returnValue = null;
            switch (a % 16) {
                case 10:
                    returnValue = "a";
                    break;
                case 11:
                    returnValue = "b";
                    break;
                case 12:
                    returnValue = "c";
                    break;
                case 13:
                    returnValue = "d";
                    break;
                case 14:
                    returnValue = "e";
                    break;
                case 15:
                    returnValue = "f";
                    break;
                default:
                    returnValue = Integer.toString(a % 16);
                    break;
            }
            return Integer.toString(a / 16) + returnValue ;
        }
    }

    public static void main(String[] args){
        System.out.println(convertToHexadecimal(14));
    }
}
