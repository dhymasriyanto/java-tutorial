import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * LatihanPath
 */
public class LatihanPath {

    public static void main(String[] args) {
        try {
            Path filename = Paths.get("C:/Users/Dhymas J. Riyanto/Documents/LesDaspro/Latihan1.java");
            byte[] data = Files.readAllBytes(filename);
            String isi = new String(data);
            System.out.println(isi);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}