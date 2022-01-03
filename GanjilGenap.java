import java.util.Scanner;

/**
 * GanjilGenap
 */
public class GanjilGenap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Angka");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Ini adalah bilangan genap");
        } else {
            System.out.println("Ini adalah bilangan ganjil");
        }
    }
}