import java.util.Scanner;

/**
 * LoginDenganIf
 */
public class LoginDenganIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Email anda : ");
        String email = sc.nextLine();

        System.out.println("Masukkan Password anda : ");
        String pass = sc.nextLine();

        // email :chelycantik@gmail.com
        // password :anggilucu
        if (email.equalsIgnoreCase("chelycantik@gmail.com") && pass.equals("Anggilucu")) {
            System.out.println("Anda berhasil masuk");
        } else {
            System.out.println("ID/password anda salah!");
        }
    }
}