public class IT26101243Lab7Q2A {

    public static void main(String[] args) {

        char pattern[][] = new char[4][5];

        for (int i = 0; i < pattern.length; i++) {

            for (int j = 0; j < pattern[i].length; j++) {

                pattern[i][j] = '$'; 

            }
        }

        for (int i = 0; i < pattern.length; i++) {

            for (int j = 0; j < pattern[i].length; j++) {

                System.out.print(pattern[i][j] + " ");

            }

            System.out.println();
            
        }
    }
}