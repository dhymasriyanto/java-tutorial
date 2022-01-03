import java.util.Scanner;

/**
 * BilanganPrima
 */
public class BilanganPrima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka");

        // 2, 3, 5, 7, 9, 11, 13 ...
        int angka = sc.nextInt();
        if ((angka == 2 || angka == 3 || angka == 5 || angka == 7 || angka == 9)
                || (angka % 1 == 0 && angka % 2 != 0 && angka % 3 != 0 && angka % 4 != 0 && angka % 5 != 0
                        && angka % 6 != 0 && angka % 7 != 0 && angka % 8 != 0 && angka % 9 != 0) && angka != 1) {
            System.out.println("Prima");
            // break;
        } else {
            System.out.println("Bukan Prima");
            // break;
        }

    }
}