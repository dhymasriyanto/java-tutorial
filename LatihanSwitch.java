import java.util.Scanner;

class LatihanSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tanggal :");
        int tanggal = sc.nextInt();

        System.out.print("Masukkan bulan :");
        int bulan = sc.nextInt();

        String zodiak = null;

        switch (bulan) {
            case 3:
                switch (tanggal) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        zodiak = "Aries";
                        break;
                    default:
                        System.out.println("Tidak ada tanggal ke-" + tanggal);
                        break;
                }
                break;
            case 4:
                switch (tanggal) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        zodiak = "Aries";
                        break;
                    default:
                        System.out.println("Tidak ada tanggal ke-" + tanggal);
                        break;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 1:
            case 2:
            default:
                System.out.println("Tidak ada bulan ke-" + bulan);
                break;
        }
        if (zodiak != null) {
            System.out.println("Zodiak anda adalah " + zodiak + ".");
        } else {
            System.out.println("Masukkan input yang benar.");
        }
    }
}