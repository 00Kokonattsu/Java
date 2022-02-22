import java.util.Scanner;

public class App {

    public static int tarif(int golongan, int penggunaan) {
        int hasil = 0;
        if (golongan == 1) {
            hasil = penggunaan * 1000;
        } else if (golongan == 2) {
            hasil = penggunaan * 1300;
        } else if (golongan == 3) {
            hasil = penggunaan * 1500;
        }
        return hasil;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String data[][] = { { "id", "Nama", "Golongan", "Alamat" }, { "1", "Galuh", "1", "Sawojajar" },
                { "2", "Indro", "3", "Kedungkandang" }, { "3", "Jedi ", "2", "Ijen" },
                { "4", "Kanu ", "3", "Dinoyo" } };
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(data[i][j] + "\t");
                if (i >= 1 && j == 2) {
                    System.out.print("\t");
                }
                if (j == 3) {
                    System.out.println();
                }
            }
        }
        System.out.print("ID Pelanggan = ");
        String nomor = input.nextLine();

        if (nomor.equals("1") || nomor.equals("2") || nomor.equals("3") || nomor.equals("4")) {
            System.out.print("Jumlah Pemakaian (kwh) = ");
            int penggunaan = input.nextInt();
            System.out.println();
            int id = Integer.parseInt(nomor);
            int golongan = Integer.parseInt(data[id][2]);
            int bayar = tarif(golongan, penggunaan);

            if (bayar <= 50000) {
                bayar = 50000;
            }

            int total = bayar + 13000;

            System.out.println("ID Pelanggan\t: " + data[id][0]);
            System.out.println("Nama Pelanggan\t: " + data[id][1]);
            System.out.println("Jumlah Pemakaian: " + penggunaan);
            System.out.println("Jumlah Tagihan\t: Rp" + total + ",-");
            System.out.println("Alamat\t\t: " + data[id][3]);
            System.out.println("Golongan\t: " + data[id][2]);
        } else {
            System.out.println("ID pelanggan tidak ditemukan/salah");
        }

        input.close();
    }
}
