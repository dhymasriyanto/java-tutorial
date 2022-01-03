import javax.swing.JOptionPane;

/**
 * LatihanJOptionPane
 */
public class LatihanJOptionPane {

    public static void main(String[] args) {
        int alas = Integer.parseInt(JOptionPane.showInputDialog("Alas :"));

        int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Tinggi :"));

        int hasil = alas * tinggi / 2;

        JOptionPane.showMessageDialog(null, hasil);
    }
}