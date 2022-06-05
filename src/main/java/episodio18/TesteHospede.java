package episodio18;

import java.util.ArrayList;
import java.util.Date;

public class TesteHospede {
    public static void main(String[] args) {
        Hospede rodrigo = new Hospede();
        rodrigo.setNome("Rodrigo");
        rodrigo.setSobrenome("Martins Pagliares");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + rodrigo.getNome());
        System.out.println("Sobrenome..: " + rodrigo.getSobrenome());

        Hospede mariana = new Hospede();
        mariana.setNome("Mariana");
        mariana.setSobrenome("Pereira");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + mariana.getNome());
        System.out.println("Sobrenome..: " + mariana.getSobrenome());

        Date data = new Date();
        ArrayList lista = new ArrayList();

        Hospede francisco = new Hospede();
        francisco.setNome("Francisco");
        francisco.setSobrenome("Ribeiro");

        Hospede maria = new Hospede();
        maria.nome = "Maria";
        maria.sobrenome = "da Silva";

        Hospede thiago = new Hospede("Thiago");
        thiago.setSobrenome("Resende");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + thiago.getNome());
        System.out.println("Sobrenome..: " + thiago.getSobrenome());

        Hospede julia = new Hospede("Júlia", "Silva");
        // exibindo o estado do objeto
        System.out.println("Nome...: " + julia.getNome());
        System.out.println("Sobrenome..: " + julia.getSobrenome());

        Hospede fabricio = new Hospede("Fabrício", "Dia");
        // exibindo o estado do objeto
        String nomeRetornado = fabricio.getNome();
        String sobrenomeRetornado = fabricio.getSobrenome();
        System.out.println("Nome...: " + nomeRetornado);
        System.out.println("Sobrenome..: " + sobrenomeRetornado);

        String nome = "Jair";
        int retornor = nome.length();
        System.out.println(retornor);

        System.out.println(nome.toUpperCase());

        Integer numeroDeprecated = new Integer(5);
        Integer numeroValueOf = Integer.valueOf(5);
        Integer numeroAutoBoxing = 5;

        System.out.println(numeroDeprecated.MIN_VALUE);
        System.out.println(numeroValueOf.MIN_VALUE);
        System.out.println(numeroAutoBoxing.MIN_VALUE);

        Hospede florentino = null;
        System.out.println(florentino.getNome());

    }
}
