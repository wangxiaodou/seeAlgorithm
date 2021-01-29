package algorithm.search.binarySearch;

/**
 * 描述: ${DESCRIPTION}
 *
 * @author bzwxd
 * @date Created in 2020-07-28 16:42
 * @description 二分法查找算法
 * @modified By
 * @version: $version$
 */
public class BinarySearch {

    /**
     * 用非递归的方式进行查找
     * @param a 原数组
     * @param value 查找的数值
     * @param n 原数据的长度
     * @return
     */
    public static int BinarySearch1(int a[],int value,int n){

        int low = 0;
        int high = n-1;
        int mid = 0;
        while (low <= high){
            mid = (low + high)/2;
            if( a[mid] == value){
                return mid;
            }else if(a[mid] > value){
                high = mid-1;
            }else if(a[mid] < value){
                low = mid+1;
            }
        }
        return -1;
    }

    /**
     * 为什么使用low + (high - low) / 2而不使用(high + low) / 2呢？
     * @param a 查找的数组
     * @param value 需要查找的数据
     * @param low 最低的位置
     * @param high 最高的位置
     * @return 返回查找到的位置
     */
    public static int BinarySearch2(int a[],int value,int low, int high){

        if(low > high){
            return -1;
        }
        int mid = low + (high - low)/2;
        if (a[mid] == value){
            return mid;
        }else if(a[mid] > value){
           return BinarySearch2(a,value,low,mid-1);
        }else if(a[mid] < value){
            // 这个地方要是不进行判断的话，可能就会不断调用
            return BinarySearch2(a,value,mid+1,high);
        }

        return -1;
    }

}
