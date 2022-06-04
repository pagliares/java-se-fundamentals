package episodio16;

public class ExemploEscopo {
    private int i =3;

    public void primeiroMetodo() {
        int i = 4, j =6;
        this.i = i + j;
        segundoMetodo(8);
    }

    public void segundoMetodo(int i) {
        int j = 7;
        this.i = i + j;
        System.out.println("Valor da variável i local..: " + i);
        System.out.println("Valor da variável de instância i..: " + this.i);
        System.out.println("Valor da variável local j..: " + j);

    }

    public static void main(String[] args) {
        ExemploEscopo ex = new ExemploEscopo();
        ex.primeiroMetodo();


    }
}
