public class Problem18 {
    public static void main(String[] args)
     {
        int rows = 7;

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= i; j--) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
