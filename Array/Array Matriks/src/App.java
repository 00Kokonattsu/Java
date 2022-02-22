import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Matriks: 1. Penjumlahan, 2. Pengurangan");
        System.out.println("Masukkan pilihanmu: ");
        String pilihanString = input.nextLine();
        if (pilihanString.equalsIgnoreCase("Penjumlahan") || pilihanString.equalsIgnoreCase("1")
                || pilihanString.equalsIgnoreCase("1. Penjumlahan")) {
            int Matriks1[][] = { {}, { 0, 1, 2, 3, 4, 5 }, { 0, 6, 7, 8, 9, 10 }, { 0, 11, 12, 13, 14, 15 } };
            int Matriks2[][] = { {}, { 0, 7, 5, 9, 2, 3 }, { 0, 7, 4, 3, 0, 7 }, { 0, 4, 7, 5, 1, 8 } };

            for (int baris = 1; baris <= 5; baris++) {
                for (int kolom = 1; kolom <= 5; kolom++) {
                    int jumlah = Matriks1[baris][kolom] + Matriks2[baris][kolom];
                    System.out.println("Baris " + baris + " kolom " + kolom + " berisi " + Matriks1[baris][kolom]
                            + " & " + Matriks2[baris][kolom] + " dijumlahkan menjadi " + jumlah);
                    if (kolom == 5) {
                        System.out.println();
                    }
                }
            }
        } else if (pilihanString.equalsIgnoreCase("Pengurangan") || pilihanString.equalsIgnoreCase("2")
                || pilihanString.equalsIgnoreCase("2. Pengurangan")) {
            System.out.println("(jarak antara absen awal dan absen akhir akan berbeda 9)");
            System.out.println("Masukkan nomer absen awal = ");
            int absenawal = input.nextInt();
            int Matriks1[][] = { {}, { 0, absenawal, absenawal + 1, absenawal + 2 },
                    { 0, absenawal + 3, absenawal + 4, absenawal + 5 },
                    { 0, absenawal + 6, absenawal + 7, absenawal + 8 } };
            int Matriks2[][] = { {}, { 0, 5, 5, 5 }, { 0, 5, 5, 5 }, { 0, 5, 5, 5 } };
            int Matriks3[][] = { {},
                    { 0, Matriks1[1][1] - Matriks2[1][1], Matriks1[1][2] - Matriks2[1][2],
                            Matriks1[1][3] - Matriks2[1][3] },
                    { 0, Matriks1[2][1] - Matriks2[2][1], Matriks1[2][2] - Matriks2[2][2],
                            Matriks1[2][3] - Matriks2[2][3] },
                    { 0, Matriks1[3][1] - Matriks2[3][1], Matriks1[3][2] - Matriks2[3][2],
                            Matriks1[3][3] - Matriks2[3][3] } };
            for (int baris = 1; baris <= 3; baris++) {
                for (int kolom = 1; kolom <= 3; kolom++) {
                    System.out.println("Baris " + baris + " kolom " + kolom + " berisi " + Matriks1[baris][kolom]
                            + " & " + Matriks2[baris][kolom] + " dikurangi menjadi " + Matriks3[baris][kolom]);
                    if (kolom == 3) {
                        System.out.println();
                    }
                }
            }
        }
        input.close();
    }
}
