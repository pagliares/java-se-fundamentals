package episodio20;

public class TesteHospede {
    public static void main(String[] args) {
        Hospede rodrigo = criarHospede("Rodrigo","Martins Pagliares");
        exibirDados(rodrigo);

        Hospede mariana = criarHospede("Mariana", "Pereira");
        exibirDados(mariana);

        Hospede francisco = criarHospede("Francisco", "Ribeiro");
        exibirDados(francisco);

        Hospede maria = criarHospede("Maria","da Silva");
        exibirDados(maria);

        Hospede thiago = criarHospede("Thiago", "Resende");
        exibirDados(thiago);

        Hospede julia = criarHospede("Júlia", "Silva");
        exibirDados(julia);

        Hospede fabricio = criarHospede("Fabrício", "Dia");
        exibirDados(fabricio);

        Hospede jair = criarHospede("Jair", "Figueiredo");
        exibirDados(jair);
    }

    public static Hospede criarHospede(String nome, String sobrenome) {
        return new Hospede(nome, sobrenome);
    }

    public static void exibirDados(Hospede h) {
        System.out.println("Nome...: " + h.getNome());
        System.out.println("Sobrenome..: " + h.getSobrenome());
    }
}
