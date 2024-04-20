public class Problem1 {
    public static void main(String[] args) {
        int rows = 5;
        int spaces = rows - 1;
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++)
             {
                System.out.print(" ");
            }
            if (i == 1 || i == rows)
             {
                for (int j = 1; j <= stars; j++) 
                {
                    System.out.print("*");
                }
            }
             else
             {
                System.out.print("*");
                for (int j = 1; j <= stars - 2; j++) 
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }
    }
}
