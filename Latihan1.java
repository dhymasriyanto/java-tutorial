import java.util.Scanner;

/**
 * Latihan1
 */
public class Latihan1 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String nama[] = new String[10] ;
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama : ");
             nama[i] = a.nextLine();        
        }
        
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }
    }
}