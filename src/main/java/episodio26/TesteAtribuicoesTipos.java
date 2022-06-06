package episodio26;

public class TesteAtribuicoesTipos {
    public static void main(String[] args) {
        long varLong1 = 45L; // declaração OK
        int varInt1 = (int)varLong1; // down casting - conversão de cima para baixo
        // up casting - conversão para cima - não depende do compilador

        int varInt2 = 34;
        long varLong2 = varInt2;

        int varInt3 = 55;
        int varInt4 = (int) 66F;

        long varLong3 = 34L;
        long varLong4 = 45;

        double varDouble1 = 34.56; // double por default
        float varFloat1 = (float)varDouble1;

        double varDouble2 = 45.67F;
        float varFloat2 = (float)34.678d;

        short a, b, c;
        a = 3;
        b = 4;
        c = (short) (a + b);

    }
}
