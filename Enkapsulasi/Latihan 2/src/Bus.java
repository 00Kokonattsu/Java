public class Bus {
    private int penumpang, maksPenumpang;

    public Bus(int maksPenumpang) {
        this.maksPenumpang = maksPenumpang;
        penumpang = 0;
    }

    public void tambahPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maksPenumpang) {
            System.out.println("Penumpang Overload");
        } else {
            this.penumpang = temp;
        }
    }

    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("Penumpang maksimal = " + maksPenumpang + "\n");
    }
}
