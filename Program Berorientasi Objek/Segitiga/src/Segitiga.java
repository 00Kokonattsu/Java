public class Segitiga {
    int alas, tinggi, sisi1, sisi2, sisi3;

    public void luasSegitiga(int alas, int tinggi) {
        double luas = 0.5 * (alas * tinggi);
        System.out.println("Luas Segitiga = " + luas);
    }

    public void KelilingSegitiga(int sisi1, int sisi2, int sisi3) {
        int keliling = sisi1 + sisi2 + sisi3;
        System.out.println("Keliling Segitiga = " + keliling);
    }
}
