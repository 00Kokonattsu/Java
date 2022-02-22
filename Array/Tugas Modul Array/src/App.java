import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Pertemuan 2 #1 & 2  (Tugas 1)
                Pertemuan 2 #3      (Tugas 2)
                Pertemuan 3 #1 & 2  (Tugas 3)
                Evaluasi            (Tugas 4)
                """);
        System.out.println("Masukkan tugas yang ingin dilakukan (run)(angka) = ");
        int tugas = input.nextInt();
        System.out.println();
        if (tugas == 1) {
            System.out.println("Pertemuan 2 #1 & 2 - Output Elemen Array");
            String peliharaan[] = { "Sukhaku", "Matatabi", "Isobu", "Son Goku", "Chomei", "Gyuki", "Kurama" };
            System.out.println(peliharaan[2]);
        } else if (tugas == 2) {
            System.out.println("Pertemuan 2 #3 - Output Elemen Array dari User");
            String siswa[] = { "", "Alif", "Dea", "Bayu", "Eren" };
            System.out.print("Masukkan pilihan anda = ");
            int pilihan = input.nextInt();
            if (pilihan <= 4 && pilihan > 0) {
                System.out.println(siswa[pilihan]);
            } else if (pilihan > 4 || pilihan == 0 || pilihan < 0) {
                System.out.println("Data tidak ditemukan");
            }
        } else if (tugas == 3) {
            System.out.println("Pertemuan 3 #1 & 2 - Output Array multi dimensional");
            String nama[][] = { { "Arya", "10001" }, { "Bagas", "10002" }, { "Chintya", "10003" } };
            int x;
            for (x = 0; x < nama.length; x++) {
                for (int y = 0; y <= x; y++) {
                    System.out.println("Nama: " + nama[x][y]);
                    y++;
                    System.out.println("Nomer: " + nama[x][y]);
                    System.out.println("=============");
                }
            }
        } else if (tugas == 4) {
            System.out.println("Evaluasi - Output Array atau Output Array dari User");
            String murid[] = { "", "Arif", "Sindu", "Monika", "Wulan", "Sari" };
            System.out.print("Daftar murid: ");
            for (String i : murid) {
                if (i.equals("Arif") || i.equals("Sindu") || i.equals("Monika") || i.equals("Wulan")) {
                    System.out.print(i + ", ");
                } else if (i.equals("Sari")) {
                    System.out.print(i);
                }
            }
            System.out.println();
            System.out.print("Masukkan angka murid = ");
            int angka = input.nextInt();
            if (angka >= 1 && angka <= 5) {
                System.out.println("Nama murid: " + murid[angka]);
            } else if (angka <= 0 || angka > 5) {
                System.out.println("Data tidak ditemukan");
            }
        }
        input.close();
    }
}
