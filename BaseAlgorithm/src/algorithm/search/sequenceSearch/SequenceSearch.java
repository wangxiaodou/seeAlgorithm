package algorithm.search.sequenceSearch;

/**
 * 描述: ${DESCRIPTION}
 *
 * @author bzwxd
 * @date Created in 2020-07-28 16:30
 * @description ${description}
 * @modified By
 * @version: $version$
 */
public class SequenceSearch {

    /**
     *
     * @param a 查找的对象
     * @param value 查找的数值
     * @param n 长度
     * @return 返回查找到的数值位置，空的情况下返回-1
     */
    public static int sequenceSearch(int a[], int value, int n){

        for(int i = 0; i < n ; i ++ ){
            if (a[i] == value){
                return i;
            }
        }
        return -1;
    }
}
