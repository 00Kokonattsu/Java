import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Perhitungan rata rata (2 nilai/input-an)");
        System.out.print("Masukkan nilai pertama = ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua = ");
        int nilai2 = input.nextInt();

        int ratarata = (nilai1 + nilai2) / 2;

        if (ratarata > 100) {
            ratarata = +8;
            System.out.println("Nilai rata rata di atas 100, ditambahkan 8");
            System.out.println("Hasil rata rata adalah " + ratarata);
        } else if (ratarata <= 100) {
            System.out.println("Hasil rata rata adalah " + ratarata);
        }
        input.close();
    }
}
