public class Problem9 {
    public static void main(String[] args) 
    
    {
        int rows = 5;
        int spaces = 0;
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= spaces; j++) 
            {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++)
             {
                System.out.print(j + " ");
            }
            System.out.println();
            spaces++;
        }
        spaces = rows - 1;
        for (int i = rows - 1; i >= 1; i--) 
        {
            for (int j = 1; j <= spaces; j++) 
            {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
            spaces--;
        }
    }
}
