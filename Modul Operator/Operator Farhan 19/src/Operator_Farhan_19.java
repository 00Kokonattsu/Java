import java.util.*;

public class Operator_Farhan_19 {
    public static void main(String[] args) {
        /*
         * Ibu Ani memiliki sebuah toko bunga. Pada suatu hari toko bunga nya mengalami
         * laris manis sehingga Ibu Ani kesusahan untuk menghitung jumlah barang (mawar
         * dan melati) yang dibeli oleh pelanggannya. Harga setiap barang Rp 4500,5,-
         * dan pembeli membeli mawar 21 dan melati 3 serta bunga matahari 5 buah. Bantu
         * ibu Ani untuk menghitung dengan program java yang memuat opearator aritmatika
         * dan penugasan ! Tambahkan perbandingan barang yang dibeli oleh konsumen !
         */
        Scanner input = new Scanner(System.in);
        int harga, mawar, melati, matahari;
        harga = 4500;

        System.out.println("|>=+=+=|Selamat Datang|=+=+=<|");
        System.out.println("Harga bunga: Rp" + harga);
        System.out.print("Berapa bunga mawar yang ingin dibeli?(angka) ");
        mawar = input.nextInt();

        System.out.print("Berapa bunga melati yang ingin dibeli?(angka) ");
        melati = input.nextInt();

        System.out.print("Berapa bunga matahari yang ingin dibeli?(angka) ");
        matahari = input.nextInt();

        int hargamawar = mawar * harga;
        System.out.println(mawar + " X " + harga + " = " + hargamawar);
        int hargamelati = melati * harga;
        System.out.println(melati + " X " + harga + " = " + hargamelati);
        int hargamatahari = matahari * harga;
        System.out.println(matahari + " X " + harga + " = " + hargamatahari);
        int hargatotal = hargamawar + hargamelati + hargamatahari;
        System.out.println("Total harga bunga yang dibeli: " + hargatotal);

        System.out.print("Jumlah uang yang dibayarkan?(angka)");
        int pembayaran = input.nextInt();
        int kembalian = pembayaran - hargatotal;
        int uangkurang = hargatotal - pembayaran;

        if (kembalian == 0) {
            System.out.println("Terimakasih telah berkunjung dan berbelanja");
        } else if (kembalian > 0) {
            System.out.println("Uang kembalian= " + kembalian);
            System.out.println("Terimakasih telah berkunjung dan berbelanja");
        } else if (kembalian < 0) {
            System.out.println("Uang tidak cukup");
            System.out.println("Mengurangi/tidak jadi/hutang?(mengurangi belum tersedia)");
            String jawaban = input.next();

            if (jawaban.equalsIgnoreCase("mengurangi")) {
                System.out.println("fitur belum tersedia");
                // System.out.println("Mana yang ingin dikurangi?");

            } else if (jawaban.equalsIgnoreCase("tidak jadi")) {
                System.out.println("Mohon maaf, silahkan kembali lagi lain waktu");
            } else if (jawaban.equalsIgnoreCase("hutang")) {

                System.out.println("Telah dicatat di buku catatan hutang sebesar " + uangkurang + " atas nama anda");
                System.out.println("Terimakasih telah berkunjung dan berbelanja");
            }
        }
        input.close();
    }
}