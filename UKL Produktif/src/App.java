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
        System.out.print(
                "Fauzan Farhan Al Qodri Irawan_19_X RPL 8\nLooping(1)/Array(2)/Seleksi Kondisi(3) \nMasukkan pilihan soal = ");
        String pilihan = input.nextLine();
        if (pilihan.equals("1") || pilihan.equalsIgnoreCase("Looping")) {
            System.out.println("\nDeret Aritmatika & Jumlahnya");
            int a;
            a = 15;
            int b;
            b = 5;
            int n;
            n = 13;
            int u;
            u = a;
            int s;
            s = a;
            System.out.println("Deret Aritmatikanya adalah");
            for (int i = 1; i <= n; i++) {
                if (i >= 1) {
                    System.out.print("Suku ke- " + i);
                    System.out.print(" = " + u);
                    System.out.println();
                }
                u = u + b;
                s = s + u;
            }
            s = s - u;
            System.out.println("Jumlah Deret Aritmatikanya adalah " + s + "\n");
            System.out.println("Deret Aritmatika berbentuk Matriks 4 X 5");
            a = 15;
            b = 5;
            u = a;
            s = a;
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print(u + "\t");
                    u = u + b;
                    s = s + u;
                }
                System.out.println();
            }
            s = s - u;
            System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
            System.out.println("\nLooping Bintang");
            for (int i = 5; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
            System.out.println("\nLooping Bintang piramida");
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
            for (int i = 2; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }

        } else if (pilihan.equals("2") || pilihan.equalsIgnoreCase("Array")) {
            int a[][] = { { -7, 5 }, { 4, 8 }, { 1, -6 }, { 3, 2 } };
            int b[][] = { { 1, 1 }, { -4, 9 }, { 7, 9 }, { 0, 0 } };
            System.out.println("Pengurangan antar matriks\nMatriks A");
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(a[i][j] + "\t");
                    if (j == 1) {
                        System.out.println();
                    }
                }
            }
            System.out.println("\nMatriks B");
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(b[i][j] + "\t");
                    if (j == 1) {
                        System.out.println();
                    }
                }
            }
            System.out.println("\nHasil A - B");
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(a[i][j] - b[i][j] + "\t");
                }
                System.out.println();
            }
            int a2[][] = { { 6, 3 }, { 2, 7 }, { 4, 8 }, { 9, 1 } };
            int b2[][] = { { 1, 5, 3, 9 }, { 2, 4, 6, 0 } };
            int h[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
            System.out.println("\nPerkalian antar Matriks");
            System.out.println("Matriks A");
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 1; j++) {
                    System.out.print(a2[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("\nMatriks B");
            for (int i = 0; i <= 1; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print(b2[i][j] + "\t");
                }
                System.out.println();
            }
            // proses perhitungan
            System.out.println("i j k l");
            int l = 0;
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    for (int k = 0; k <= 1; k++) {
                        h[i][j] = h[i][j] + a2[j][k] * b2[k][i];
                        System.out.println(i + " " + j + " " + k + " " + l + " | h (" + h[i][j] + ") | a (" + a2[j][k]
                                + ") | b (" + b2[k][i] + ")");
                        j++;
                        l++;
                    }
                    j--;
                    l--;
                }
            }
            // menampilkan hasil
            System.out.println("\nHasil A X B");
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print(h[i][j] + "\t");
                }
                System.out.println();
            }

        } else if (pilihan.equals("3") || pilihan.equalsIgnoreCase("Seleksi Kondisi")
                || pilihan.equalsIgnoreCase("Condition Selection")) {
            System.out.println("\nPenghitungan tagihan listrik");
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
                System.out.println("Jumlah Pemakaian: " + penggunaan + " kwh");
                System.out.println("Jumlah Tagihan\t: Rp" + total + ",-");
                System.out.println("Alamat\t\t: " + data[id][3]);
                System.out.println("Golongan\t: " + data[id][2]);
            } else {
                System.out.println("ID pelanggan tidak ditemukan/salah");
            }
        } else {
            System.out.println("Inputan salah");
        }
        input.close();
    }
}
