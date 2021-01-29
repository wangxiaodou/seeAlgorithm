package 动态规划;// 动态规划的题目

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {


        int result = 0;
        int minIndex = -1;

        for(int j = triangle.size()-1;j >= 1; j -- ){
            List<Integer> subList = triangle.get(j);
            minIndex = getMinIndex(subList,minIndex,subList.size());
            System.out.println(" subList.get(minIndex) = " + subList.get(minIndex));
            result += subList.get(minIndex);

        }
        return result +triangle.get(0).get(0) ;

    }


    public static int getMinIndex(List<Integer> upList,int minIndex,int downListSize){
        if(minIndex == -1){
            minIndex = 0;
            for(int j = 1; j < upList.size(); j++){
                if(upList.get(j) < upList.get(minIndex)) {
                    minIndex = j;
                }
            }
            return minIndex;
        }else if(minIndex == 0){
            return 0;
        }else if(minIndex == downListSize){
            return upList.size() -1;
        }else{
           return upList.get(minIndex -1) > upList.get(minIndex)?minIndex:minIndex -1;
        }


    }


    public static void main(String[] args) {
        List<Integer> upList = new LinkedList<Integer>(Arrays.asList(1,-1,-3));
        List<Integer> upList2 = new LinkedList<Integer>(Arrays.asList(2,3));
        List<Integer> upList3 = new LinkedList<Integer>(Arrays.asList(-1));
        //List<Integer> upList4 = new LinkedList<Integer>(Arrays.asList(2));
        List<List<Integer>> triangle = new LinkedList<>();
        //triangle.add(upList4);
        triangle.add(upList3);
        triangle.add(upList2);
        triangle.add(upList);

        System.out.println(new Solution().minimumTotal(triangle));
    }
}
