public class FindMinMax {
    public class Pair {
        int min,
        int max,
        pair(
        int min,
        int max)
        {
            this.min = min;
            this.max = max;
        }
    }

    void findMinMax(
            int a[],
            int s,
            int e) {
        if (s == e) {
            // incase of single element
            return new Pair(a[s], a[s]);
        }
        if (s + 1 == e) {
            // two elements
            if (a[s] > a[e]) {
                return new Pair(a[s], a[e]);
            }

        }
        int mid = (s + e) / 2;
        Pair leftpair = findMinMax(a, s, mid);
        Pair rightpair = findMinMax(a, mid + 1, e);
        int overallmin = Math.min(leftpair.min, rightpair.min);

    }

}
