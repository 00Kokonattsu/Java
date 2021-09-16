import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Restoran Extraveiganza");
        System.out.println();
        System.out.println("Menu");
        System.out.println("1. Soto ayam lamongan (Rp35.000,00,-)");
        System.out.println("2. Rawon (Rp55.000,00,-)");
        System.out.println("3. Tahu campur (Rp20.000,00,-)");
        System.out.println();
        System.out.println("Ditambah PPN 10%");

        System.out.println("Makanan yang dipilih (1/2/3)");
        int makanan = input.nextInt();
        System.out.println("Jumlah porsi (angka)");
        int porsi = input.nextInt();

        double hargaakhir;
        double ppn = 0.1;
        double pajak;
        double harga;
        double uangbayar;
        switch (makanan) {
            case 1:
                harga = 35000;
                pajak = harga * porsi * ppn;
                hargaakhir = harga * porsi + pajak;
                System.out.println("Total harga: " + hargaakhir);
                System.out.println("Uang yang dibayarkan");
                uangbayar = input.nextInt();
                if (uangbayar == hargaakhir) {
                    System.out.println("Terimakasih telah memilih extraveiganza, makanan akan segera diantarkan");
                } else if (uangbayar <= hargaakhir) {
                    double kembalian = hargaakhir - uangbayar;
                    System.out.println("Tagihan sebesar " + kembalian + " akan dikirimkan ke keuangan online anda");
                } else if (uangbayar >= hargaakhir) {
                    double kembalian = uangbayar - hargaakhir;
                    System.out.println("Kembalian sebesar " + kembalian + " akan diantarkan");
                }
                break;
            case 2:
                harga = 55000;
                pajak = harga * porsi * ppn;
                hargaakhir = harga * porsi + pajak;
                System.out.println("Total harga: " + hargaakhir);
                System.out.println("Uang yang dibayarkan");
                uangbayar = input.nextInt();
                if (uangbayar == hargaakhir) {
                    System.out.println("Terimakasih telah memilih extraveiganza, makanan akan segera diantarkan");
                } else if (uangbayar <= hargaakhir) {
                    double kembalian = hargaakhir - uangbayar;
                    System.out.println("Tagihan sebesar " + kembalian + "akan dikirimkan ke keuangan online anda");
                } else if (uangbayar >= hargaakhir) {
                    double kembalian = uangbayar - hargaakhir;
                    System.out.println("Kembalian sebesar " + kembalian + " akan diantarkan");
                }
                break;
            case 3:
                harga = 20000;
                pajak = harga * porsi * ppn;
                hargaakhir = harga * porsi + pajak;
                System.out.println("Total harga: " + hargaakhir);
                System.out.println("Uang yang dibayarkan");
                uangbayar = input.nextInt();
                if (uangbayar == hargaakhir) {
                    System.out.println("Terimakasih telah memilih extraveiganza, makanan akan segera diantarkan");
                } else if (uangbayar <= hargaakhir) {
                    double kembalian = hargaakhir - uangbayar;
                    System.out.println("Tagihan sebesar " + kembalian + "akan dikirimkan ke keuangan online anda");
                } else if (uangbayar >= hargaakhir) {
                    double kembalian = uangbayar - hargaakhir;
                    System.out.println("Kembalian sebesar " + kembalian + " akan diantarkan");
                }
                break;
        }
        input.close();
    }
}
