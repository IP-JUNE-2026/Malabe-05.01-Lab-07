public class IT26101270Lab7Q2B {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " - ");
            int j = 1;
            while (j <= i) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}