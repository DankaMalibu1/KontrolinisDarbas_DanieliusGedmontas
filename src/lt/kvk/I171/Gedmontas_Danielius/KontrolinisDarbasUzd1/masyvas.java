package lt.kvk.I171.Gedmontas_Danielius.KontrolinisDarbasUzd1;

public class masyvas {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int masyvas[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                masyvas[i][j] = (int) (2 * Math.random());
                System.out.println(masyvas[i][j]);
            }
        }
    }
}
