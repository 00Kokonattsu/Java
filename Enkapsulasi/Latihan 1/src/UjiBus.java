public class UjiBus {
    public static void main(String[] args) {
        Bus lyn = new Bus();
        lyn.penumpang = 5;
        lyn.maksPenumpang = 5;
        lyn.cetak();

        lyn.penumpang = lyn.penumpang + 5;
        lyn.cetak();

        lyn.penumpang = lyn.penumpang - 2;
        lyn.cetak();

        lyn.penumpang = lyn.penumpang + 8;
        lyn.cetak();
    }
}
