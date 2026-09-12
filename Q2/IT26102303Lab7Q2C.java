public class IT26102303Lab7Q2C {
    public static void main(String[] args) {
        // Variable declarations for loop counters
        int i, j;

        // Outer loop goes from 5 down to 1
        for (i = 5; i >= 1; i--) {
            // Inner loop prints the current number 'i', 'i' times
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(); 
        }
    }
}
