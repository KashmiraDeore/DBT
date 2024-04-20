public class Problem13 {
    public static void main(String[] args) {
        int rows = 6; 
        for (int i = 0; i < rows; i++) {
           
            for (int j = 0; j < rows - i - 1; j++)
             {
                System.out.print(" ");
            }
            
           
            System.out.print((char)('A' + i));
            
           
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                 {
                    System.out.print(" ");
                }
                
                if (i != rows - 1) {
                    System.out.print(" " + (char)('A' + i));
                }
            }
            System.out.println();
        }
        
        // Loop through each row (lower half)
        for (int i = rows - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print characters
            System.out.print((char)('A' + i));
            
            // Print spaces between characters
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                
                // Print characters (excluding 'A')
                System.out.print(" " + (char)('A' + i));
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
