public class Problem5{
    public static void main(String[] args) 
    {
        int rows = 4;
        int spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++)
             {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
             {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++)
             {
                System.out.print(j);
            }
            System.out.println();
            spaces--;
        }
        spaces = 1;
        for (int i = rows - 1; i >= 1; i--)
         {
            for (int j = 1; j <= spaces; j++)
             {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
             {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++)
             {
                System.out.print(j);
            }
            System.out.println();
            spaces++;
        }
    }
}
