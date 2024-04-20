public class Problem25 {
    public static void main(String[] args) 
    {
        int rows = 7;
        for (int i = 1; i <= rows; i++) {
            int startValue = i;
            for (int j = 1; j <= rows; j++)
             {
                System.out.print(startValue + " ");
                startValue++;
                if (startValue > rows)
                 {
                    startValue = 1;
                }
            }
            System.out.println();
        }
    }
}
