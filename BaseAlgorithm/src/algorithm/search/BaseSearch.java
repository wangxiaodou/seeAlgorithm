package algorithm.search;


import algorithm.search.insertionSearch.InterpolationSearch;

/**
 * 描述: ${DESCRIPTION}
 *
 * @author bzwxd
 * @date Created in 2020-07-28 16:28
 * @description ${description}
 * @modified By
 * @version: $version$
 */
public class BaseSearch {

    public static void main(String[] args) {
        /*int[] intArray = new int[]{10,20,30,16,28};
        int result = SequenceSearch.sequenceSearch(intArray,10,intArray.length);
        System.out.println(result);

        int[] intArray2 = new int[]{10,20,30,40,50};
        int result2 = BinarySearch.BinarySearch1(intArray2,30,intArray2.length);
        System.out.println(result2);

        int result3 = BinarySearch.BinarySearch2(intArray2,35,0,intArray2.length);
        System.out.println(result3);*/

        int[] intArray4 = new int[]{10,20,30,40,50,60,70,80,90,100};
        int result4 = InterpolationSearch.InterpolationSearch1(intArray4,65);
        System.out.println(result4);

        int result5 = InterpolationSearch.InterpolationSearch2(intArray4,65,0,9);
        System.out.println(result5);

    }
}
