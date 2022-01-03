import java.util.Scanner;

/**
 * NegatifPositif
 */
public class NegatifPositif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka");

        int angka = sc.nextInt();

        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif");
        } else {
            System.out.println("Angka yang anda masukkan adalah 0");
        }
    }
}