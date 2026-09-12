public class IT26102303Lab7Q2B {
    public static void main(String[] args) {
        // Variable declarations for loop counters
        int i, j;

        // Outer loop for lines 1 to 5
        for (i = 1; i <= 5; i++) {
            // Print the line prefix matching the output format
            System.out.print(i + " - ");
            
            // Inner loop prints stars equal to the current line number
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            
            System.out.println(); 
        }
    }
}
