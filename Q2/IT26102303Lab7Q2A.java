public class IT26102303Lab7Q2A {
    public static void main(String[] args) {
        // Variable declarations for loop counters
        int i, j;

        // Nested loops to print the pattern (4 rows, 5 columns)
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print(" $ ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
