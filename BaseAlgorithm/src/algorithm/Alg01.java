package algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * 描述: ${DESCRIPTION}
 *
 * @author bzwxd
 * @date Created in 2020-07-27 18:27
 * @description ${description}
 * @modified By
 * @version: $version$
 */
public class Alg01 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("6", "1", "3", "1","2");

       //sort方法在这里
        // Collections.sort(strings);

       /*  for (String string : strings) {

            System.out.println(string);
        }*/

       strings.contains(111);
        mergeSort(strings.toArray().clone(),strings.toArray(),0,5,0);
    }


    private static void mergeSort(Object[] src,
                                  Object[] dest,
                                  int low,
                                  int high,
                                  int off) {
        int length = high - low;

        // Insertion sort on smallest arrays
        if (length < 7) {
            for (int i=low; i<high; i++){
                for (int j=i; j >low &&
                        ((Comparable) dest[j-1]).compareTo(dest[j])>0; j--){
                    swap(dest, j, j-1);

                }
            }
            return;
        }
    }

    private static void swap(Object[] x, int a, int b) {
        Object t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
}
