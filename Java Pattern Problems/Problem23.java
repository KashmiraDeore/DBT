public class Problem23 {
    public static void main(String[] args)
     {
        int rows = 7;
        for (int i = 1; i <= rows; i++) 
        
        {
            int startValue = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= rows; j++)
             {
                System.out.print(startValue);

                startValue = 1 - startValue;
            }
            System.out.println();
        }
    }
}
