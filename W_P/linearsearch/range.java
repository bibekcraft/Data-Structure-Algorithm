
//arr=[18,12,-7,3,14,28]

public class range {
    public static void main(String[] args) {
        int[] num = { 18, 12, -3, 3, 14, 18 };
        int target = 18;
        System.out.println(findrange(num, target, 0, 4));

    }

    static int findrange(int[] num, int target, int start, int end) {
        if (num.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = num[i];
            if (element == target) {
                return i;
            }
        }
        return -1;

    }

}
