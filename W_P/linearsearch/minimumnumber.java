
public class minimumnumber {
    public static void main(String[] args) {
        int[] num = { 10, 0, 30, 40, 50 };
        System.out.println(minimum(num));

    }

    static int minimum(int[] num) {
        int ans = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < ans) {
                ans = num[i];
            }
        }
        return ans;

    }

}
