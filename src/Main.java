public class Main {
    public static void main(String[] args) {
        Mercado loja = new Mercado(1,"Carvalho");
        Produtos A1 = new Produtos("Arroz", 5, 1);
        Produtos A2 = new Produtos("Feijão", 5, 2);
        Produtos A3 = new Produtos("Ovos", 5, 3);
        Produtos A4 = new Produtos("Carne", 5, 4);
        Produtos A5 = new Produtos("Banana", 5, 5);


        loja.cadastraProdutos(A1);
        loja.cadastraProdutos(A2);
        loja.cadastraProdutos(A3);
        loja.cadastraProdutos(A4);
        loja.cadastraProdutos(A5);
        System.out.println("Nome | Codigo | Qnt");
        Produtos.addQnt(A2,1);
        Produtos.remQnt(A2,1);
        loja.listarProdutos();
    }
}