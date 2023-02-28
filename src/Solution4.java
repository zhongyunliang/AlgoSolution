public class Solution4 {
    public int heapSelect(int[] A, int k) {
        int n = A.length;
        buildMinHeap(A, n);
        int result = 0;
        for (int i = 0; i < k; i++) {
            result = extractMin(A, n - i);
        }
        return result;
    }

    private static void buildMinHeap(int[] A, int n) {
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }
    }

    private static void heapify(int[] A, int n, int i) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int smallest = i;
        if (left < n && A[left] < A[smallest]) {
            smallest = left;
        }
        if (right < n && A[right] < A[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(A, i, smallest);
            heapify(A, n, smallest);
        }
    }

    private static int extractMin(int[] A, int n) {
        int result = A[0];
        A[0] = A[n-1];
        heapify(A, n-1, 0);
        return result;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
