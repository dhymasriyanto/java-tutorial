import java.util.Scanner;

/**
 * Kabisat
 */
public class Kabisat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan tahun");
        int tahun = sc.nextInt();

        if (tahun % 4 == 0) {
            System.out.println("Ini adalah tahun kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}