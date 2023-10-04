public class Mercado {
    //    Atributos
    private int cnpj;
    private String nome;
    private int numProdutos;
    private Produtos[] estoque;

    //Objeto Mercado
    public Mercado(int cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.estoque = new Produtos[20];//inicializando o estoque
    }


    //Método de registro de produto
    public void cadastraProdutos(Produtos p){
        this.estoque[this.numProdutos] = p;
        this.numProdutos++;
    }

    public void listarProdutos(){
        for (int i = 0; i < this.numProdutos;i++){
            this.estoque[i].listaInformacoes(nome);
        }
    }

    //firula
    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumProdutos() {
        return numProdutos;
    }

    public void setNumProdutos(int numProdutos) {
        this.numProdutos = numProdutos;
    }

    public Produtos[] getEstoque() {
        return estoque;
    }

    public void setEstoque(Produtos[] estoque) {
        this.estoque = estoque;
    }

    void cadastraProduto(Produtos produtos, int qntProdutos){

    }
}