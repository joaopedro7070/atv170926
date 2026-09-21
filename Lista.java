import java.util.LinkedList;

public class Lista {
    public static void main(String[] args) {
        LinkedList<Produto> produtos = new LinkedList<>();

        produtos.addFirst(new Produto("Arroz", 25.90));
        produtos.addLast(new Produto("Feijao", 8.50));

        produtos.addFirst(new Produto("Leite", 6.50));
        produtos.addLast(new Produto("Cafe", 12.00));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}