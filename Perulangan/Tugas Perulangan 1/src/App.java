import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Perulangan counted loop
        // Perulangan For
        int a;
        for (a = 1; a <= 2; a++) {
            System.out.println("Aku siap menjadi orang sukses");
        }

        // Perulangan For-Each
        int nilai1[] = { 90, 80, 70, 100, 75 };
        for (int angka : nilai1) {
            System.out.println(angka + " ");
        }

        // Perulangan While
        // boolean nilai2 = false;
        // while (nilai2 != true) {
        // System.out.println("Mengulangi terus");
        // }

        // Perulangan Do While
        int nilai3 = 0;
        do {
            System.out.println("Perulangan ke- " + nilai3);
            nilai3++;
        } while (nilai3 <= 10);

        String m;
        System.out.println("Masukkan namamu: ");
        m = input.nextLine();
        int k;
        System.out.println("Masukkan jumlah siswa dikelasmu: ");
        k = input.nextInt();
        int l;
        System.out.println("Masukkan nomer absen kamu: ");
        int absen = input.nextInt();
        input.close();
        for (l = 1; l <= k; l++) {
            System.out.println("namaSiswa " + l);
            if (l == absen) {
                System.out.println("^ Kamu (" + m + ")");
            }
        }
        input.close();
    }
}