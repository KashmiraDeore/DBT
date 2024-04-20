public class Problem10 {
    public static void main(String[] args) 
    {
        int rows = 6; 
        int asciiValue = 65;
        for (int i = 1; i <= rows; i++)
         {

            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (asciiValue + i - 1) + " ");
            }
            System.out.println();
        }
    }
}

