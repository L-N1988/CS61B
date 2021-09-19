public class Triangel 
{
    public static void drawTriangle(int n)
    {
        int i = n;
        int j;
        while (i != 0)
        {
            i = i - 1;
            for (j = n - i; j != 0; j = j - 1)
            {
                System.out.print("*");
            } 
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}