import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println(">[Pengecekan predikat dan kriteria]<");
        int nilai;
        do {
            System.out.println();
            System.out.println("> Predikat");
            System.out.print("Masukkan nilaimu (angka): ");
            nilai = scan.nextInt();
            String predikat;
            if (nilai >= 96 && nilai <= 100) {
                predikat = "A";
                System.out.println("Kamu berpredikat " + predikat);
            } else if (nilai >= 91 && nilai <= 95) {
                predikat = "A-";
                System.out.println("Kamu berpredikat " + predikat);
            } else if (nilai >= 86 && nilai <= 90) {
                predikat = "B+";
                System.out.println("Kamu berpredikat " + predikat);
            } else if (nilai >= 81 && nilai <= 85) {
                predikat = "B";
                System.out.println("Kamu berpredikat " + predikat);
            } else if (nilai >= 75 && nilai <= 80) {
                predikat = "B-";
                System.out.println("Kamu berpredikat " + predikat);
            } else if (nilai >= 70 && nilai <= 74) {
                predikat = "C+";
                System.out.println("Kamu berpredikat " + predikat);
            } else if (nilai >= 65 && nilai <= 69) {
                predikat = "C";
                System.out.println("Kamu berpredikat " + predikat);
            } else if (nilai >= 60 && nilai <= 64) {
                predikat = "C-";
                System.out.println("Kamu berpredikat " + predikat);
            } else if (nilai >= 55 && nilai <= 59) {
                predikat = "D+";
                System.out.println("Kamu berpredikat " + predikat);
            } else if (nilai >= 0 && nilai <= 54) {
                predikat = "D";
                System.out.println("Kamu berpredikat " + predikat);
            } else {
                System.out.println();
                System.out.println("Masukkan nilaimu antara 0 - 100 (Angka, bukan huruf/kata)");
            }

            System.out.println();
            System.out.println("> Kriteria");
            System.out.print("Masukkan predikatmu (huruf kapital): ");
            String kriteria;
            kriteria = scan.next();
            switch (kriteria) {
                case "A":
                    System.out.println("Kamu berkriteria sangat baik");
                    break;
                case "A-":
                    System.out.println("Kamu berkriteria sangat baik");
                    break;
                case "B+":
                    System.out.println("Kamu berkriteria baik");
                    break;
                case "B":
                    System.out.println("Kamu berkriteria baik");
                    break;
                case "B-":
                    System.out.println("Kamu berkriteria baik");
                    break;
                case "C+":
                    System.out.println("Kamu berkriteria cukup baik");
                    break;
                case "C":
                    System.out.println("Kamu berkriteria cukup baik");
                    break;
                case "C-":
                    System.out.println("Kamu berkriteria cukup baik");
                    break;
                case "D+":
                    System.out.println("Kamu berkriteria kurang baik");
                    break;
                case "D":
                    System.out.println("Kamu berkriteria kurang baik");
                    break;
            }
        } while (nilai < 0 || nilai > 100);
        System.out.println();
        scan.close();
    }

}
