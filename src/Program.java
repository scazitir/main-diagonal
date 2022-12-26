import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        System.out.print("Size: ");
        int n = scan.nextInt();

        int[][] mtx = new int[n][n];
        for (int i = 0; i < mtx.length; i++){
            for (int j = 0; j < mtx[i].length; j++){
                mtx[i][j] = scan.nextInt();
            }
        }

        System.out.print("\nMain Diagonal: ");
        for (int i = 0; i < mtx.length; i++){
            System.out.print(mtx[i][i] + " ");
        }
        /*for (int i = 0; i < mtx.length; i++){
            for (int j = 0; j < mtx[i].length; j++){
                if (i == j) {
                    System.out.print(mtx[i][j] + " ");
                }
            }
        }*/

        System.out.print("\nNegative numbers: ");
        for (int i = 0; i < mtx.length; i++){
            for (int j = 0; j < mtx[i].length; j++){
                if (mtx[i][j] < 0) {
                    System.out.print(mtx[i][j] + " ");
                }
            }
        }
        scan.close();
    }
}
