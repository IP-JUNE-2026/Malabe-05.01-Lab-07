public class IT26101270Lab7Q2C {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int digit = 6 - i;
            int count = 6 - i;
            int j = 1;
            while (j <= count) {
                System.out.print(digit);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}