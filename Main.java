import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente("João", "joao@email.com");
        Pedido pedido = new Pedido(cliente);

        System.out.println("=== LOJA ONLINE ===");
        System.out.println("1. Livro Físico (R$ 50,00 + frete)");
        System.out.println("2. Curso Digital (R$ 100,00 + taxa)");
        System.out.print("Escolha um produto (1 ou 2): ");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            Produto livro = new ProdutoFisico("Livro POO", 50.0, 0.5);
            pedido.adicionarProduto(livro);
        } else if (escolha == 2) {
            Produto curso = new ProdutoDigital("Curso Java", 100.0);
            pedido.adicionarProduto(curso);
        }

        System.out.println("Total: R$" + pedido.calcularTotal());
        scanner.close();
    }
}