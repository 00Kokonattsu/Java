public class Bus {
    private double penumpang, maksPenumpang, counter, penumpangBaru;
    public String passwordLock;

    public Bus(int maksPenumpang) {
        this.maksPenumpang = maksPenumpang;
        penumpang = 0;
    }

    public void tambahPenumpang(int penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maksPenumpang) {
            System.out.println("Penumpang Overload");
        } else if (temp == maksPenumpang) {
            System.out.println("Penumpang penuh");
        } else {
            this.penumpang = temp;
            System.out.println("Masukkan berat " + temp + " penumpang ");
        }
    }

    public double getCounter() {
        return counter;
    }

    public void setCounter(double newCounter) {
        counter += newCounter;
    }

    public void getAverage() {
        double ratarata;
        ratarata = counter / penumpang;
        System.out.println("Rata - rata berat penumpang sekarang adalah " + ratarata + " Kg ");
    }

    public String getPassword(String password) {
        if (password.equalsIgnoreCase("90")) {
            System.out.println("Password benar");
            passwordLock = "true";
        } else {
            System.out.println("Password salah");
            passwordLock = "false";
        }
        return passwordLock;
    }

    public void cetak() {
        if (passwordLock.equalsIgnoreCase("true")) {
            System.out.println("Penumpang sekarang = " + penumpang);
            System.out.println("Penumpang seharusnya = " + maksPenumpang);
        } else if (passwordLock.equalsIgnoreCase("false")) {
            System.out.println("Password salah, output tidak keluar");
        }
    }
}