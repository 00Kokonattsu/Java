public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("+Aset gudang: ");
        int laptop, harddisk, mouse;
        int harga;
        System.out.println("No. Nama Barang Jumlah Barang Harga satuan");

        // Laptop
        laptop = 7;
        harga = 11;
        System.out.println("1.  Laptop      " + laptop + "             " + harga + " juta");

        // Harddisk
        harddisk = 11;
        double disk;
        disk = 1.5;
        System.out.println("2.  Harddisk    " + harddisk + "            " + disk + " juta");

        // Mouse
        mouse = 21;
        harga = 150;
        System.out.println("2.  Mouse       " + mouse + "            " + harga + " ribu");

        System.out.println();
        // Total harga
        int totalharga;
        System.out.println("+Total harga: ");

        // Laptop
        harga = 11;
        totalharga = laptop * harga;
        System.out.println("Laptop      = " + totalharga + " juta");

        double totaldisk;
        disk = 1.5;
        totaldisk = harddisk * disk;
        System.out.println("Harddisk    = " + totaldisk + " juta");

        double totalmouse;
        double mos = 0.150;
        totalmouse = mouse * mos;
        System.out.println("Mouse       = " + totalmouse + " juta");
    }
}
