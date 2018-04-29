public class MyArrays {
    public boolean binarysSearch(int[] x, int srch) {
        int start = 0;
        int end = x.length - 1;

        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (srch == x[mid]) {
                return true;
            } else if (srch < x[mid]) {
                end = mid - 1;
            } else if (srch > x[mid]) {
                start = mid + 1;
            }
        }
        return false;
    }

    /*
        Kadane's algorithm
     */
    public void maxSubArraySum(int a[], int size) {
        int max_so_far = Integer.MIN_VALUE,
                max_ending_here = 0, start = 0,
                end = 0, s = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here += a[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }

    public int[] removeDuplicateSorted(int[] a) {
        int j = 0, i = 0;
        for (i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[i];
        int[] x = new int[j + 1];
        for (int q = 0; q <= j; q++) {
            x[q] = a[q];
        }
        return x;
    }
}
