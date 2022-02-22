public class App {
    public static void main(String[] args) throws Exception {
        int Matriks3x4[][] = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
        System.out.println(Matriks3x4[0][0]);
        System.out.println(Matriks3x4[0][1]);
        System.out.println(Matriks3x4[1][0]);
        System.out.println(Matriks3x4[1][1]);
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println(Matriks3x4[i][j]);
            }
        }
    }
}
