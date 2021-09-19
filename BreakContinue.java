public class BreakContinue {
    public static int min(int x, int y)
    {
        if (x < y)
        {
            return x;
        }
        return y;
    }
    public static void windowPosSum(int[] a, int n) {
        /** your code here */ 
        int i = 0;
        for (i = 0; i < a.length; i++)
        {
            int j;
            int sum = 0;
            if (a[i] < 0)
            {
                continue;
            }
            for (j = i + 1; j < min(a.length, i + n + 1); j++)
            {
                sum = sum + a[j];
            }
            // System.out.println(sum);
            a[i] = a[i] + sum;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}