public class Produto {
    String nome;
    Double preco;
    int quantidade;

    public Produto(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public Produto(){}

        public void exibirInformacoes(){
            System.out.println("Nome do produto é: " + nome);
            System.out.println("O preço do produto é: R$ " + preco);
            System.out.println("No estoque: " + quantidade);
        }


    public void comprar(int quantidadecomprada){
        if(quantidadecomprada <= quantidade){
            quantidade -= quantidadecomprada;
            System.out.println("Compra realizada! Quantidade restante: " + quantidade);
        } else{
            System.out.println("Quantidade insuficiente em estoque!");
        }
    }

    public void adicionarEstoque(int quantidadeAdicional){
        quantidade += quantidadeAdicional;
        System.out.println("Quantidade adicionada! novo total: " + quantidade);
    }

    public void aplicarDesconto(double percentualDesconto){
        double desconto = preco * (percentualDesconto / 100);
        preco -= desconto;
        System.out.println("Desconto aplicado! Novo preço: R$ " + preco);
    }
}
