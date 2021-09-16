import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Harga total belanjaan: ");
        double hargatotal = input.nextInt();
        double potongan;
        double diskon;
        double hargapotongan;
        if (hargatotal >= 150000 && hargatotal <= 499999) {
            potongan = 0.02;
            diskon = hargatotal * potongan;
            hargapotongan = hargatotal - diskon;
            System.out.println("Selamat, anda mendapatkan potongan harga (diskon) 2%, bernominal " + diskon);
            System.out.println("Harga awal sebesar " + hargatotal + " menjadi " + hargapotongan);
        } else if (hargatotal >= 500000 && hargatotal <= 999999) {
            potongan = 0.05;
            diskon = hargatotal * potongan;
            hargapotongan = hargatotal * potongan;
            System.out.println("Selamat, anda mendapatkan potongan harga (diskon) 5%, bernominal " + diskon);
            System.out.println("Harga awal sebesar " + hargatotal + " menjadi " + hargapotongan);
        } else if (hargatotal >= 1000000) {
            potongan = 0.1;
            diskon = hargatotal * potongan;
            hargapotongan = hargatotal - diskon;
            System.out.println("Selamat, anda mendapatkan potongan harga (diskon) 5%, bernominal " + diskon);
            System.out.println("Harga awal sebesar " + hargatotal + " menjadi " + hargapotongan);
        } else if (hargatotal <= -1) {
            System.out.println("???");
        } else {
            System.out.println("Terimakasih telah berbelanja");
        }
        input.close();
    }
}
