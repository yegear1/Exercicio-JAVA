public class Produtos {
    //    ATRIBUTOS
    private String nome;
    private int qnt;
    private int cod;

    public Produtos(String nome, int qnt, int cod) {
        this.nome = nome;
        this.qnt = qnt;
        this.cod = cod;
    }

    public void listaInformacoes(String nome) {
        System.out.print(this.getNome() + " - ");
        System.out.print(this.getCod() + " - ");
        System.out.println(this.getQnt());
    }

    public static void addQnt(Produtos produto, int qnt) {
        produto.setQnt(produto.getQnt() + qnt);
    }

    public static void remQnt(Produtos produto, int qnt) {
        produto.remQnt(produto.remQnt() + qnt);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}