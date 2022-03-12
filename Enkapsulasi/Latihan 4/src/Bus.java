public class Bus {
    private int penumpang, maxPenumpang;
    private boolean pass; // untuk kunci sandi dari program

    // Konstruktor
    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    } // untuk menentukan penumpang maksimal dan jumlah penumpang di bus yang kosong

    // Method mutator
    public void plusPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang Overload");
        } else if (temp == maxPenumpang) {
            System.out.println("Penumpang penuh");
        } else {
            this.penumpang = temp;
        }
    } // untuk menambah penumpang dan menampilkan pesan overload

    public boolean getPass() {
        return pass;
    } // untuk mendapatkan akses boolean pass

    public void getPassword(int password) {
        if (password == 90) {
            System.out.println("Password benar");
            pass = true;
        } else {
            System.out.println("Password salah");
            pass = false;
        }
    } // untuk menentukan benar salahnya sandi yang dimasukkan

    public void cetak() {
        if (pass == true) {
            System.out.println("Penumpang sekarang = " + penumpang);
            System.out.println("Penumpang yang dapat dibawa = " + maxPenumpang + "\n");
        } // untuk mencetak pesan
    }
}
