import java.util.Scanner;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random random = new java.util.Random();

        System.out.println("Pemeriksaan sebelum memasuki daerah sekolah");
        System.out.println("Pengecekan suhu");
        System.out.print("Masukkan suhu tubuhmu = ");
        double suhu = input.nextDouble();
        if (suhu >= 36.0 && suhu < 37.0) {
            System.out.println("Lanjut ke pemeriksaan ke-2");
            System.out.println();
            System.out.println("Memeriksa kesiapan prokes");
            System.out.println("Apakah kamu membawa masker & hand sanitizer? (ya/tidak)");
            String prokes = input.next();
            if (prokes.equalsIgnoreCase("ya")) {
                System.out.println("Lanjut ke pemeriksaan ke-3");
                System.out.println();
                System.out.println(
                        "Apakah kamu memiliki dan membawa bukti tes swab antigen? (hasil menunjukkan negatif) (ya/tidak)");
                String buktiswab = input.next();
                if (buktiswab.equalsIgnoreCase("ya")) {
                    System.out.println("Silahkan ke kelas");
                } else if (buktiswab.equalsIgnoreCase("tidak")) {
                    System.out.println("Silahkan pergi ke aula untuk pemeriksaan");
                    String[] swab = { "positif", "negatif" };
                    int hasilswab = random.nextInt(swab.length);
                    System.out.println(swab[hasilswab]);
                }
            } else if (prokes.equalsIgnoreCase("tidak")) {
                System.out.println("Silahkan pulang dan mengambil masker & hand sanitizer");
            }
        } else {
            System.out.println("Silahkan pergi ke UKS");
        }
        input.close();
    }
}
