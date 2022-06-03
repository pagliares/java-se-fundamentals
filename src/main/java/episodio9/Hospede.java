package episodio9;

class Hospede {
    String nome; // campo, variável de instância, atributo
    String sobrenome;

    public Hospede() {
    }

    public Hospede(String nome) {
        this.nome = nome;
    }

    public Hospede(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public static void main(String[] args) {
        Hospede rodrigo = new Hospede();
        rodrigo.setNome("Rodrigo");
        rodrigo.setSobrenome("Martins Pagliares");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + rodrigo.getNome());
        System.out.println("Sobrenome..: " + rodrigo.getSobrenome());
    }
}
