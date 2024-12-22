public class BinaryCeiling {

    public static void main(String[] args) {
        int[] arr = { 1, 23, 33, 43, 53, 63, 73 };
        int target = 42;
        System.out.println(Ceiling(arr, target));

    }

    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;

    }
}