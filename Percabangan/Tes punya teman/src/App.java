import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan nilai anda: ");
        nilai = input.nextInt();
        int predikatangka = 0;
        if (nilai >= 96 && nilai <= 100) {
            System.out.println("Anda mendapatkan predikat A");
            predikatangka = 1;
        } else if (nilai >= 91 && nilai <= 95) {
            System.out.println("Anda mendapatkan predikat A-");
            predikatangka = 1;
        } else if (nilai >= 86 && nilai <= 90) {
            System.out.println("Anda mendapatkan predikat B+");
            predikatangka = 2;
        } else if (nilai >= 81 && nilai <= 85) {
            System.out.println("Anda mendapatkan predikat B");
            predikatangka = 2;
        } else if (nilai >= 75 && nilai <= 80) {
            System.out.println("Anda mendapatkan predikat B-");
            predikatangka = 2;
        } else if (nilai >= 70 && nilai <= 74) {
            System.out.println("Anda mendapatkan predikat C+");
            predikatangka = 3;
        } else if (nilai >= 65 && nilai <= 69) {
            System.out.println("Anda mendapatkan predikat C");
            predikatangka = 3;
        } else if (nilai >= 60 && nilai <= 64) {
            System.out.println("Anda mendapatkan predikat C-");
            predikatangka = 3;
        } else if (nilai >= 55 && nilai <= 59) {
            System.out.println("Anda mendapatkan predikat D+");
            predikatangka = 4;
        } else if (nilai >= 0 && nilai <= 54) {
            System.out.println("Anda mendapatkan predikat D");
            predikatangka = 4;

        }
        switch (predikatangka) {
            case 1:
                System.out.println("Nilai anda sangat baik");
                break;
            case 2:
                System.out.println("Nilai anda baik");
                break;
            case 3:
                System.out.println("Nilai anda cukup");
                break;
            case 4:
                System.out.println("Nilai anda kurang");
                break;
        }
        input.close();
    }
}