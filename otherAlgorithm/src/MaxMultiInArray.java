/**
 * 求出数组中子数组的最大累乘积
 *  貌似使用动态规划可以解决
 */
public class MaxMultiInArray {


    public double getMaxMultiInArray(double[] arr){
        double res = Double.MIN_VALUE;
        double[] dp = new double[arr.length];
        dp[0] = arr[0];
        for(int i = 1;i < arr.length; i++){
            dp[i] = Math.max(arr[i],dp[i-1] * arr[i]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    public double getMaxMultiInArray2(double[] arr){
        double res = arr[0];
        double max = arr[0];
        double min = arr[0];
        double maxEnd = 0;
        double minEnd = 0;
        for(int i = 1;i < arr.length; i++){
            maxEnd = max * arr[i];
            minEnd = min * arr[i];
            max = Math.max(Math.max(maxEnd,minEnd),arr[i]);
            min = Math.min(Math.min(maxEnd,minEnd),arr[i]);
            res = Math.max(res,max);
        }
        return res;
    }

    public static void main(String[] args) {
        double[] arr = new double[]{-2.5,4,0,3,0.5,8,-1};
        System.out.println(new MaxMultiInArray().getMaxMultiInArray(arr));
        System.out.println(new MaxMultiInArray().getMaxMultiInArray2(arr));
    }

    /**
     *
     */

}
