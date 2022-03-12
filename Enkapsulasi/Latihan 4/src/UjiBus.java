public class UjiBus {
    public static void main(String[] args) {
        Bus Lyn = new Bus(10);
        Lyn.getPassword(40); // melakukan tes agar mengecek jika program bekerja dengan benar
        Lyn.getPassword(90); // memasukkan password yang benar
        Lyn.plusPenumpang(3);
        Lyn.cetak();

        Lyn.plusPenumpang(1);
        Lyn.cetak();

        Lyn.plusPenumpang(1);
        Lyn.cetak();
    }
}
