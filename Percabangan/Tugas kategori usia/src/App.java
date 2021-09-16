import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Pengkategorian usia");
        System.out.print("Masukkan angka = ");
        int usia = input.nextInt();

        if (usia >= 0 && usia <= 5) {
            System.out.println("Balita");
        } else if (usia >= 6 && usia <= 11) {
            System.out.println("Kanak kanak");
        } else if (usia >= 12 && usia <= 16) {
            System.out.println("Remaja");
        } else if (usia >= 17 && usia <= 25) {
            System.out.println("Remaja akhir");
        } else if (usia >= 26 && usia <= 35) {
            System.out.println("Dewasa awal");
        } else if (usia >= 36 && usia <= 45) {
            System.out.println("Dewasa akhir");
        } else if (usia >= 46 && usia <= 55) {
            System.out.println("Lansia awal");
        } else if (usia >= 56 && usia <= 65) {
            System.out.println("Lansia akhir");
        } else if (usia >= 65 && usia <= 99) {
            System.out.println("Manula");
        } else if (usia >= 100 && usia <= 199) {
            System.out.println("Nggak tau");
        } else if (usia >= 200 && usia <= 299) {
            System.out.println("Ok");
        } else if (usia >= 300) {
            System.out.println("???");
        } else if (usia <= -1) {
            System.out.println("Kandungan?(ya/tidak)");
            String kandungan = input.next();
            if (kandungan.equalsIgnoreCase("ya")) {
                System.out.println("Salah pilih kategori");
            } else if (kandungan.equalsIgnoreCase("tidak")) {
                System.out.println("Ok");
            }
        }

        input.close();
    }
}
