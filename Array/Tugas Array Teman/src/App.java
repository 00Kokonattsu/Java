public class App {
    public static void main(String[] args) throws Exception {
        int Matriks[] = new int[35];
        int i;
        for (i = 0; i <= Matriks.length;) {
            Matriks[] = {i};
            do {
                i++;
                i++;
                i++;
            } while (Matriks.length <= 9 && i <= 35);
            for (int a : Matriks) {
                if (i >= Matriks[9] && i <= Matriks[18]) {
                    System.out.println(a);
                }
            }
        }

    }
}
