public class UjiBus {
    public static void main(String[] args) {
        Bus Lyn = new Bus(10);
        Lyn.cetak();

        Lyn.tambahPenumpang(3);
        Lyn.cetak();

        Lyn.tambahPenumpang(1);
        Lyn.cetak();

        Lyn.tambahPenumpang(1);
        Lyn.cetak();
    }
}
