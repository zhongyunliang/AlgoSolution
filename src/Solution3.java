public class Solution3 {
    public void heapSort(int[] A) {
        int n = A.length;
        // Build a max-heap from the input array A
        for (int i = n/2; i >= 1; i--) {
            int j = i;
            while (2*j-1 < n) {
                int k = 2*j-1;
                if (k+1 < n && A[k+1] > A[k]) {
                    k = k+1;
                }
                if (A[k] > A[j-1]) {
                    int temp = A[j-1];
                    A[j-1] = A[k];
                    A[k] = temp;
                    j = k+1;
                } else {
                    break;
                }
            }
        }
        // Extract the maximum element from the max-heap and move it to the end of the array
        for (int i = n; i >= 2; i--) {
            int temp = A[0];
            A[0] = A[i-1];
            A[i-1] = temp;
            int j = 1;
            while (2*j-1 < i-1) {
                int k = 2*j-1;
                if (k+1 < i-1 && A[k+1] > A[k]) {
                    k = k+1;
                }
                if (A[k] > A[j-1]) {
                    temp = A[j-1];
                    A[j-1] = A[k];
                    A[k] = temp;
                    j = k+1;
                } else {
                    break;
                }
            }
        }
    }
}
