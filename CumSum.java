 import java.util.Arrays;

class CumSum {
    public static void main(String[] args) {
        int[] arr = {25, 40, 12, 46, 36, 48};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        System.out.println("Cumulative Sum Array: " + Arrays.toString(arr));
    }
}

