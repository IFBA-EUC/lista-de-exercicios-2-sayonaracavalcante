import static java.util.Collections.nCopies;
import static java.lang.String.join;

public class questão17 {
        
    private static final int[] DECI =
    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROM =
    {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
    public static String converterEmRomanos(int dec) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < DECI.length; i++) {
            int parteInteira = dec / DECI[i];
            dec -= DECI[i] * parteInteira;
            resultado.append(join("", nCopies(parteInteira, ROM[i])));
        }
        return resultado.toString();
    }
}
