import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * LatihanInput
 */
public class LatihanInput {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("Masukkan nama : ");
        
            String nama = br.readLine();
            System.out.println(nama);
        } catch (IOException e) {
            System.out.println("Error");    
        }
       

        
    }
}