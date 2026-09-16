public class IT26101270Lab7Q2A {
    public static void main(String[] args) {
        int row = 1;
        while (row <= 4) {
            int col = 1;
            while (col <= 5) {
                if (col == 5) {
                    System.out.print("$");
                } else {
                    System.out.print("$ ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}