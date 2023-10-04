public class Produtos {
    //    ATRIBUTOS
    private String nome;

    public Produtos(String nome) {
        this.nome = nome;
    }

    public void listaInformacoes(String nome) {
        System.out.println(this.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}