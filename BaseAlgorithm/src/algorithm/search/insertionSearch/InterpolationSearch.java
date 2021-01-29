package algorithm.search.insertionSearch;

/**
 * 描述: ${DESCRIPTION}
 *
 * @author bzwxd
 * @date Created in 2020-07-28 17:51
 * @description ${description}
 * @modified By
 * @version: $version$
 */
public class InterpolationSearch {

    /**
     * 用非递归的方式进行差值查找
     * @param a 原数组
     * @param value 查找的数值
     * @return
     */
    public static int InterpolationSearch1(int a[],int value) {

        int low = 0;
        int high = a.length - 1;
        //
        int mid;
        //  mid = low+(key-a[low])/(a[high]-a[low])*(high-low)
        // 这个判断条件很重要！ 不能缺少
        while (a[low] != a[high] && value >= a[low] && value <= a[high]) {
            mid = low + (high - low) * (value - a[low]) / (a[high] - a[low]);
          if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            }else {
              return mid;
          }
        }
        // 如果是 2,2,2,2,2这种全部重复元素，返回第一个2
        if(value == a[low]) {
            return low;
        }
        return -1;
    }

    /**
     * @param a 查找的数组
     * @param value 需要查找的数据
     * @param low 最低的位置
     * @param high 最高的位置
     * @return 返回查找到的位置
     */
    public static int InterpolationSearch2(int a[],int value,int low, int high){

        if (a == null || a.length == 0 || low > high || value < a[low]
                || value > a[high]) {
            return -1;
        }
        int mid = low +  (high-low) * (value - a[low])/(a[high]-a[low]);
        if (a[mid] == value){
            return mid;
        }else if(a[mid] > value){
            return InterpolationSearch2(a,value,low,mid-1);
        }else if(a[mid] < value){
            // 这个地方要是不进行判断的话，可能就会不断调用
            return InterpolationSearch2(a,value,mid+1,high);
        }
        return -1;
    }
}
