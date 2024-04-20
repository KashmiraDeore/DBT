public class Problem11 {
    public static void main(String[] args) 
    {
        int rows = 6; 
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
             {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
             {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
