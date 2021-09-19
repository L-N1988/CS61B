public class ClassNameHere {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int i = 0;
        int Max = (m.length == 0) ? 0 : m[0];
        for (i = 1; i < m.length; i++)
        {
            if (Max < m[i])
            {
                Max = m[i];
            }
            else
            {
                ;
            }
        }
        return Max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
       System.out.println(max(numbers));
    }
}
