public class Problem20 {
    public static void main(String[] args) 
    {
        int rows = 7;

        
        for (int i = 0; i < rows; i++)
         {
           
            for (int j = 0; j < i; j++)
             {
                System.out.print("  ");
            }
            for (int j = i + 1; j <= rows; j++)
             {
                System.out.print(j);
            }
            System.out.println();
        }

    
        for (int i = rows - 2; i >= 0; i--)
         {
           
            for (int j = 0; j < i; j++) 
            {
                System.out.print("  ");
            }
            for (int j = i + 1; j <= rows; j++) 
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
