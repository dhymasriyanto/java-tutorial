/**
 * LatihanSwitch2
 */
public class LatihanSwitch2 {

    public static void main(String[] args) {
        // Switch
        // ? apa bedanya dengan if
        int gaji = 200000;
        switch (gaji) {
        case 100000:
        case :
            System.out.println("UKT 1");
            break;
        case 1000000:
            System.out.println("UKT 2");
            break;

        default:
            System.out.println("tidak ada di pilihan");
            break;
        }
    }
}