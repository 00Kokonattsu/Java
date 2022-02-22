import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Pengurutan angka (Matriks 3 x 4)");
        System.out.print("Masukkan angka pertama = ");
        int angka = input.nextInt(); // angka +
        System.out.println();
        int Matriks3x4[][] = { { 0 }, { 0, angka, angka + 1, angka + 2, angka + 3 },
                { 0, angka + 4, angka + 5, angka + 6, angka + 7 },
                { 0, angka + 8, angka + 9, angka + 10, angka + 11 } };
        for (int baris = 1; baris < 5; baris++) {
            for (int kolom = 1; kolom < 5; kolom++) {
                System.out.println("Baris " + baris + " kolom " + kolom + " berisi " + Matriks3x4[baris][kolom]);
                if (kolom == 4) {
                    System.out.println();
                }
            }
        }
        input.close();
    }
}
