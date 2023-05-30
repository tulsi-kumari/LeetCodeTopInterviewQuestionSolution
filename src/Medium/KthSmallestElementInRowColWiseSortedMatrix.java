package Medium;
import java.util.*;
//Since each of the rows in matrix are already sorted, we can understand the problem as finding the kth smallest element
// from amongst M sorted rows.
//We start the pointers to point to the beginning of each rows, then we iterate k times, for each time ith, the top of
// the minHeap is the ith smallest element in the matrix. We pop the top from the minHeap then add the next element which
// has the same row with that top to the minHeap.
//
public class KthSmallestElementInRowColWiseSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparing(o->o[0]));

        for(int i=0;i<n;i++){
            pq.add(new int[]{
                    matrix[i][0],i,0
            });
        }
        int count=0;
        int ans=0;
        for(int i=0;i<k;i++){
            int[] top=pq.peek();
            pq.poll();
            if(top[2]<n-1){
                pq.offer(new int[]{matrix[top[1]][top[2]+1],top[1],top[2]+1});
            }
            count++;
            if(count==k){
                ans=top[0];
            }

        }
        return ans;
    }
}
