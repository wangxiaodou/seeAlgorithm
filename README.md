# 算法学习小记录
### 2021-01-07 开始学习算法记录  争取每天三道题，每天复习前一天的记录

整理自己刷题过程中小窍门的知识

之前整理过，不过都丢失了，只记得一个

1、String char 转化 int 的 s.charAt(i) - '0' 就能回去获取数值

2、队列的实例化中 如果式Queue queue = new LinkedList<>(); 的话，添加元素可以是
  queue.add(1);
  queue.offer(1);
  queue.poll(); 就是弹出一个元素，删除元素
  queue.peek();// 获取队列头元素，但是不删除

3、数组类数组填充
    int[] dp = new int[amount+1];
    int max = amount + 1;
    Arrays.fill(dp, max);
 4、  List<Integer> list = new LinkedList<Integer>();
        Integer[] res =list.toArray(new Integer[0]);
       //  String[] y = list.toArray(new String[0]);
        Arrays.sort(res);
