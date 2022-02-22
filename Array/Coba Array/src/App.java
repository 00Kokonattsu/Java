import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan jumlah siswa = ");
        jumlah = input.nextInt();
        String siswa[] = new String[jumlah];
        input.nextLine();
        for (int i = 0; i < siswa.length; i++) {
            System.out.print("Masukkan nama siswa: ");
            siswa[i] = input.nextLine();
        }
        int y = 0;
        for (int x = 0; x < siswa.length; x++) {
            y++;
            System.out.println("Nama siswa ke-" + y + " adalah " + siswa[x]);
        }
        input.close();
    }
}
