import java.util.Scanner;

public class App {

    public static String pendapatan(int gajiortu) {
        if (gajiortu < 2000000) {
            return "A";
        } else if (gajiortu >= 2000000 && gajiortu <= 10000000) {
            return "B";
        } else if (gajiortu > 10000000) {
            return "C";
        }
    }

    public static int totalbayar(String jalur, String golongan, int jumlah) {
        int sbmptn[][] = { { 5000000, 500000 }, { 15000000, 1000000 }, { 30000000, 2000000 } };
        int snmptn[][] = { { 7000000, 500000 }, { 17000000, 1000000 }, { 35000000, 2000000 } };
        int mandiri[][] = { { 10000000, 1000000 }, { 25000000, 2000000 }, { 50000000, 3000000 } };
        int total = 0;
        if (jalur.equalsIgnoreCase("sbmptn")) {
            if (golongan.equalsIgnoreCase("a")) {
                total = sbmptn[0][0] + sbmptn[0][1] * jumlah;
            } else if (golongan.equalsIgnoreCase("b")) {
                total = sbmptn[1][0] + sbmptn[1][1] * jumlah;
            } else if (golongan.equalsIgnoreCase("c")) {
                total = sbmptn[2][0] + sbmptn[2][1] * jumlah;
            }
        } else if (jalur.equalsIgnoreCase("snmptn")) {
            if (golongan.equalsIgnoreCase("a")) {
                total = snmptn[0][0] + snmptn[0][1] * jumlah;
            } else if (golongan.equalsIgnoreCase("b")) {
                total = snmptn[1][0] + snmptn[1][1] * jumlah;
            } else if (golongan.equalsIgnoreCase("c")) {
                total = snmptn[2][0] + snmptn[2][1] * jumlah;
            }
        } else if (jalur.equalsIgnoreCase("mandiri")) {
            if (golongan.equalsIgnoreCase("a")) {
                total = mandiri[0][0] + mandiri[0][1] * jumlah;
            } else if (golongan.equalsIgnoreCase("b")) {
                total = mandiri[1][0] + mandiri[1][1] * jumlah;
            } else if (golongan.equalsIgnoreCase("c")) {
                total = mandiri[2][0] + mandiri[2][1] * jumlah;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Jalur Masuk Golongan    DSP     SPP
                SBMPTN      A           5 juta  500 ribu
                            B           15 juta 1 juta
                            C           30 juta 2 juta
                SNMPTN      A           7 juta  500 ribu
                            B           17 juta 1 juta
                            C           35 juta 2 juta
                Mandiri     A           10 juta 1 juta
                            B           25 juta 2 juta
                            C           50 juta 3 juta""");
        String dataKampusSBM[][] = { { "", "", "", "", "" }, { "A", "5", "juta", "500", "ribu" },
                { "B", "15", "juta", "1", "juta" }, { "C", "30", "juta", "2", "juta" } };
        String dataKampusSNM[][] = { { "", "", "", "", "" }, { "A", "7", "juta", "500", "ribu" },
                { "B", "17", "juta", "1", "juta" }, { "A", "35", "juta", "2", "juta" } };
        String dataKampusMan[][] = { { "", "", "", "", "" }, { "A", "10", "juta", "1", "juta" },
                { "B", "25", "juta", "2", "juta" }, { "C", "50", "juta", "3", "juta" } };
        String data[][] = { { "", "", "", "" }, { "id", "Nama", "Jalur masuk", "Alamat " },
                { "1", "Mira", "SBMPTN", "Sawojajar" }, { "2", "Nina", "SNMPTN", "Kedungkandang" },
                { "3", "Oemar", "Mandiri", "Ijen" }, { "4", "Pena", "SBMPTN", "Dinoyo" } };
        System.out.println("Masukkan ID = ");
        int id = input.nextInt();
        id++;
        System.out.println("ID: " + data[id][0]);
        System.out.println("Nama: " + data[id][1]);
        System.out.println("Jalur masuk: " + data[id][2]);
        System.out.println("Alamat: " + data[id][3]);
        if (id == 2 || id == 5) {
            System.out.println("Masukkan golongan yang dipilih = ");
            String golongan = input.next();
            if (golongan.equalsIgnoreCase("a")) {
                System.out.println("Golongan: " + dataKampusSBM[1][0]);
                System.out.println("DSP: " + dataKampusSBM[1][1] + dataKampusSBM[1][2]);
                System.out.println("SPP: " + dataKampusSBM[1][4] + dataKampusSBM[1][5]);
            } else if (golongan.equalsIgnoreCase("b")) {

            } else if (golongan.equalsIgnoreCase("c")) {

            }
        } else if (id == 3) {
            System.out.println("Masukkan golongan yang dipilih = ");
            String golongan = input.next();
            if (golongan.equalsIgnoreCase("a")) {

            } else if (golongan.equalsIgnoreCase("b")) {

            } else if (golongan.equalsIgnoreCase("c")) {

            }
        } else if (id == 4) {
            System.out.println("Masukkan golongan yang dipilih = ");
            String golongan = input.next();
            if (golongan.equalsIgnoreCase("a")) {

            } else if (golongan.equalsIgnoreCase("b")) {

            } else if (golongan.equalsIgnoreCase("c")) {

            }
        }
        input.close();
    }
}
