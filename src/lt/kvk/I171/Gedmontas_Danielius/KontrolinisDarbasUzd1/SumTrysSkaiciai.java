package lt.kvk.I171.Gedmontas_Danielius.KontrolinisDarbasUzd1;

public class SumTrysSkaiciai {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(782));
    }

    public static int sumDigitsInNumber(int skaicius) {
        int a = 7;
        int b = 8;
        int c = 2;
        int d = skaicius%10;
        int e = d + skaicius;
        return skaicius / 10;

    }
}
