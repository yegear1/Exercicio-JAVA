public class Main {
    public static void main(String[] args) {
        Mercado loja = new Mercado(3252,"Carvalho");
        Produtos A1 = new Produtos("Arroz");
        Produtos A2 = new Produtos("Feijão");
        Produtos A3 = new Produtos("Ovos");
        Produtos A4 = new Produtos("Carne");
        Produtos A5 = new Produtos("Banana");

        loja.cadastraProdutos(A1);
        loja.cadastraProdutos(A2);
        loja.cadastraProdutos(A3);
        loja.cadastraProdutos(A4);
        loja.cadastraProdutos(A5);
        loja.listarProdutos();
    }
}