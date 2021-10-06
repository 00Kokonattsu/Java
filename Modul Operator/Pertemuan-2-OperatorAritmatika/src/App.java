public class App {
    public static void main(String[] args) throws Exception {
        int mawar = 10, melati = 2, matahari = 5;
        double harga;
        harga = 4500.5;
        double total, bayar;

        /* operator penugasan */
        melati += 2;
        /* Operator Aritmatika */
        total = mawar + melati + matahari;
        bayar = total * harga;

        System.out.println("jumlah barang yang dibeli = " + mawar + "+" + melati + "+" + matahari + "=" + total);
        System.out.println("total yang dibayar = Rp" + bayar);
        boolean palingbanyak1 = mawar > melati;
        System.out.println("Bunga Mawar > bunga melati " + palingbanyak1);
        boolean palingbanyak2 = mawar > matahari;
        System.out.println("Pembelian bunga mawar lebih banyak dari pembelian matahari dan melati " + palingbanyak2);
    }
}
