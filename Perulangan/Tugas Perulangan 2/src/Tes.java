import javax.swing.JOptionPane;

public class Tes {
    public static void main(String[] args) throws Exception {
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai"));
        int a = 1;
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(i);
            a = a * i;
        }
        System.out.println(a);
    }
}
