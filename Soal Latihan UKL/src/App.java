import java.util.Scanner;

public class App {
    public static int tarif(int golongan) {
        Scanner input = new Scanner(System.in);
        int tarif = 0;
        System.out.println("Masukkan kota asal anda (Waru/Sidoarjo/Porong)");
        String asal = input.nextLine();
        if (asal.equalsIgnoreCase("Waru")) {
            System.out.println("Masukkan kota tujuan anda (Sidoarjo/Porong)");
            String tujuan = input.next();
            input.close();
            if (tujuan.equalsIgnoreCase("Sidoarjo")) {
                if (golongan == 1) {
                    return tarif = 6000;
                } else if (golongan == 2) {
                    return tarif = 9000;
                } else if (golongan == 3) {
                    return tarif = 9000;
                }
            }
            if (tujuan.equalsIgnoreCase("Porong")) {
                if (golongan == 1) {
                    return tarif = 9000;
                } else if (golongan == 2) {
                    return tarif = 14000;
                } else if (golongan == 3) {
                    return tarif = 14000;
                }
            }
        } else if (asal.equalsIgnoreCase("Sidoarjo")) {
            System.out.println("Masukkan kota tujuan anda (Waru/Porong)");
            String tujuan = input.next();
            input.close();
            if (tujuan.equalsIgnoreCase("Waru")) {
                if (golongan == 1) {
                    return tarif = 6000;
                } else if (golongan == 2) {
                    return tarif = 9000;
                } else if (golongan == 3) {
                    return tarif = 9000;
                }
            }
            if (tujuan.equalsIgnoreCase("Porong")) {
                if (golongan == 1) {
                    return tarif = 5500;
                } else if (golongan == 2) {
                    return tarif = 8500;
                } else if (golongan == 3) {
                    return tarif = 8500;
                }
            }
        } else if (asal.equalsIgnoreCase("Porong")) {
            System.out.println("Masukkan kota tujuan anda (Sidoarjo/Waru)");
            String tujuan = input.next();
            input.close();
            if (tujuan.equalsIgnoreCase("Sidoarjo")) {
                if (golongan == 1) {
                    return tarif = 5500;
                } else if (golongan == 2) {
                    return tarif = 8500;
                } else if (golongan == 3) {
                    return tarif = 8500;
                }
            }
            if (tujuan.equalsIgnoreCase("Waru")) {
                if (golongan == 1) {
                    return tarif = 9000;
                } else if (golongan == 2) {
                    return tarif = 14000;
                } else if (golongan == 3) {
                    return tarif = 14000;
                }
            }
        }
        return tarif;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Nomer {1, 2, 3, 4, 5} \nMasukkan nomer soal = ");
        int nomer = input.nextInt();
        if (nomer == 1) {
            int a = 20;
            int b = 5;
            int n = 18;
            int u = a;
            int s = a;
            System.out.println("Deret Aritmatikanya adalah");
            for (int i = 0; i <= n; i++) {
                if (i > 5) {
                    System.out.print("Suku ke- " + i);
                    System.out.print(" = " + u);
                    System.out.println();
                }
                u = u + b;
                s = s + u;
            }
            s = s - u;
            System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
        } else if (nomer == 2) {
            int a = 5;
            int b = 3;
            int u = a;
            int s = a;
            System.out.println("Deret Aritmatikanya adalah");
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 4; j++) {
                    System.out.print(u + "\t");
                    u = u + b;
                    s = s + u;
                }
                System.out.println();
            }
            s = s - u;
            System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
        } else if (nomer == 3) {
            int a = 5;
            int b = 3;
            int u = a;
            int s = a;
            System.out.println("Deret Aritmatikanya adalah");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5 - i; j++) {
                    System.out.print(u + "\t");
                    u = u + b;
                    s = s + u;
                }
                System.out.println();
            }
            s = s - u;
            System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
        } else if (nomer == 4) {
            System.out.println("Masukkan jenis kendaraan anda (mobil/truk)");
            String kendaraan = input.next();
            int golongan;
            if (kendaraan.equalsIgnoreCase("mobil")) {
                System.out.println("\nKendaraan anda termasuk ke golongan 1");
                System.out.println();
                golongan = 1;
                System.out.println("Tarif tol anda adalah sejumlah " + tarif(golongan));
            } else if (kendaraan.equalsIgnoreCase("truk")) {
                System.out.println("Masukkan tipe truk anda (2 sumbu roda/3 sumbu roda)");
                String truk = input.nextLine();
                if (truk.equalsIgnoreCase("2 sumbu roda") || truk.equalsIgnoreCase("2 sumbu")) {
                    System.out.println("\nKendaraan anda termasuk ke golongan 2");
                    System.out.println();
                    golongan = 2;
                    System.out.println("Tarif tol anda adalah sejumlah " + tarif(golongan));
                } else if (truk.equalsIgnoreCase("3 sumbu roda") || truk.equalsIgnoreCase("3 sumbu")) {
                    System.out.println("\nKendaraan anda termasuk ke golongan 3");
                    System.out.println();
                    golongan = 3;
                    System.out.println("Tarif tol anda adalah sejumlah " + tarif(golongan));
                } else {
                    System.out.println("Maaf, input salah");
                }
            } else {
                System.out.println("Maaf, input salah");
            }
        } else if (nomer == 5) {
            System.out.println("ID\tNama Pelanggan\n1\tAli\n2\tBudi\n3\tDani\n4\tEdi\n5\tUmar");
            System.out.println("Masukkan ID anda: ");
            String id = input.nextLine();
            System.out.println("""

                    Cottage\t\tRoom\tWeekday\t\tWeekend\t\tHoliday
                    Duku\t\t2\tRp915.000,-\tRP1.025.000,-\tRp1.225.000,-
                    Jeruk\t\t2\tRp915.000,-\tRP1.025.000,-\tRp1.225.000,-

                    Alpukat\t\t1\tRp575.000,-\tRP695.000,-\tRp895.000,-
                    Jambu Air\t1\tRp575.000,-\tRP695.000,-\tRp895.000,-

                    Durian\t\t2\tRp595.000,-\tRP715.000,-\tRp915.000,-
                    Melon\t\t2\tRp595.000,-\tRP715.000,-\tRp915.000,-

                    Belimbing\t2\tRp495.000,-\tRP575.000,-\tRp755.000,-
                    Mangga\t\t2\tRp495.000,-\tRP575.000,-\tRp755.000,-
                    Kedondong\t2\tRp495.000,-\tRP575.000,-\tRp755.000,-

                    Barrack\tPer-person\tRp25.000,-\tRP25.000,-\tRp35.000,-""");
            System.out.print("Masukkan tipe cottage pilihan anda: ");
            String Cottage = input.nextLine();
            System.out.print("Masukkan hari mulai penginapan anda(Weekday/Weekend/Holiday): ");
            String hari = input.nextLine();
            if (Cottage.equalsIgnoreCase("Duku") || Cottage.equalsIgnoreCase("Jeruk")) {

            } else if (Cottage.equalsIgnoreCase("Alpukat") || Cottage.equalsIgnoreCase("Jambu Air")) {

            } else if (Cottage.equalsIgnoreCase("Durian") || Cottage.equalsIgnoreCase("Melon")) {

            } else if (Cottage.equalsIgnoreCase("Belimbing") || Cottage.equalsIgnoreCase("Mangga")
                    || Cottage.equalsIgnoreCase("Kedondong")) {

            } else {
                System.out.println("Maaf, inputan anda salah");
            }
        }
        input.close();
    }
}
