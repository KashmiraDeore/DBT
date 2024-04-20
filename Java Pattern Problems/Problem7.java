public class Problem7 {
    public static void main(String[] args) 
    {
        int rows = 5;
        for (int i = 1; i <= rows; i++) 
        {
            int startNumber = (i % 2 == 0) ? 1 : 0;
            for (int j = 1; j <= rows; j++)
             {
                System.out.print((startNumber + j) % 2);
            }
            System.out.println();
        }
    }
}
