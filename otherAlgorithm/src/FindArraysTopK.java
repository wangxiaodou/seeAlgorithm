/**
 * 查找有序的多个数组的TopK ，
 * 看这个样子想利用树进行操作，堆排序的操作
 *
 */
public class FindArraysTopK {

    public void printTopK(int[][] matrix,int topK){

        int heapSize = matrix.length;
        HeapNode[] heapNodes = new HeapNode[heapSize];

        for (int i = 0; i != heapSize ; i++) {
            int index = matrix[i].length -1;
            heapNodes[i] = new HeapNode(matrix[i][index],i,index);
            heapInsert(heapNodes,i);
        }
        System.out.println("TOP " + topK + ":" );

        for (int i = 0; i != topK ; i++) {
            if (heapSize == 0) break;
            System.out.print(heapNodes[0].value + " ");
            if(heapNodes[0].index != 0){
                heapNodes[0].value = matrix[heapNodes[0].arrNum][--heapNodes[0].index];
            }else{
                swap(heapNodes,0,--heapSize);
            }

            heapify(heapNodes,0,heapSize);

        }




    }
    // 插入堆
    public void heapInsert(HeapNode[] heap,int index){
        while (index != 0){

            int parent = (index -1) / 2;
            if(heap[parent].value < heap[index].value){
                swap(heap,parent,index);
                index = parent;
            }else{
                break;
            }

        }
    }

    public void swap(HeapNode[] heapNodes,int index1,int index2){
        HeapNode tmp = heapNodes[index1];
        heapNodes[index1] = heapNodes[index2];
        heapNodes[index2] = tmp ;

    }
    public void heapify(HeapNode[] heap,int index,int heapSize){
        int left = index *2 + 1;
        int right = index *2 + 2;
        int largest = index;
        while(left < heapSize){
            if(heap[left].value > heap[index].value){
                largest = index;
            }
            if (right < heapSize && heap[right].value > heap[largest].value){
                largest = right;
            }
            if (largest != index){
                swap(heap,largest,index);
            }else{
                break;
            }

            index = largest;
            left = index * 2 + 1;
            right = index * 2 + 2;
        }


    }
}


class HeapNode{
    public int value;
    public int arrNum;
    public int index;
    public HeapNode(int value,int arrNum,int index){
        this.value = value;
        this.arrNum = arrNum;
        this.index = index;
    }
}
