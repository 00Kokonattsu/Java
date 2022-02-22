import java.util.Scanner;

public class Guru {
    public static String pendapatan(int gajiortu) {
        if (gajiortu < 2000000) {
            return "A";
        } else if (gajiortu >= 2000000 && gajiortu <= 10000000) {
            return "B";
        } else if (gajiortu > 10000000) {
            return "C";
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        input.close();
    }
}
