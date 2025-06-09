package tprecurssiva;

    import java.util.ArrayList;
    import java.util.Scanner;
    
    class Produto {
        int codigo;
        String nome;
        double preco;
        int quantidade;
    
        Produto(int codigo, String nome, double preco, int quantidade) {
            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    
        @Override
        public String toString() {
            return "código: " + codigo + ", nome: " + nome +
                   ", preço: R$" + preco + ", quantidade: " + quantidade;
        }
    }
    
    public class array {
        static ArrayList<Produto> listaProdutos = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);
    
        public static void main(String[] args) {
            int opcao;
    
            do {
                System.out.println("\n==== MENU SISTEMA CRUD ====");
                System.out.println("1. cadastrar novos produtos");
                System.out.println("2. listar todos os produtos cadastrados");
                System.out.println("3. atualizar dados de um produto específico");
                System.out.println("4. remover um produto do estoque");
                System.out.println("5. buscar um produto pelo código");
                System.out.println("6. calcular o valor total do estoque");
                System.out.println("7. sair");
                System.out.print("escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpar o buffer
    
                switch (opcao) {
                    case 1 -> cadastrarProduto();
                    case 2 -> listarProdutos();
                    case 3 -> atualizarProduto();
                    case 4 -> removerProduto();
                    case 5 -> buscarProdutoPorCodigo();
                    case 6 -> calcularValorTotalEstoque();
                    case 7 -> System.out.println("encerrando...");
                    default -> System.out.println("opção inválida!");
                }
            } while (opcao != 7);
        }
    
        static void cadastrarProduto() {
            System.out.print("código: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("nome: ");
            String nome = scanner.nextLine();
    
            System.out.print("preço: ");
            double preco = scanner.nextDouble();
    
            System.out.print("quantidade: ");
            int quantidade = scanner.nextInt();
    
            Produto novo = new Produto(codigo, nome, preco, quantidade);
            listaProdutos.add(novo);
            System.out.println("produto cadastrado com sucesso!");
        }
    
        static void listarProdutos() {
            if (listaProdutos.isEmpty()) {
                System.out.println("nenhum produto cadastrado.");
            } else {
                for (Produto p : listaProdutos) {
                    System.out.println(p);
                }
            }
        }
    
        static void atualizarProduto() {
            System.out.print("informe o código do produto: ");
            int codigo = scanner.nextInt();
    
            for (Produto p : listaProdutos) {
                if (p.codigo == codigo) {
                    scanner.nextLine(); // limpar o buffer
                    System.out.print("novo nome: ");
                    p.nome = scanner.nextLine();
                    System.out.print("novo preço: ");
                    p.preco = scanner.nextDouble();
                    System.out.print("nova quantidade: ");
                    p.quantidade = scanner.nextInt();
                    System.out.println("produto atualizado!");
                    return;
                }
            }
            System.out.println("produto não encontrado.");
        }
    
        static void removerProduto() {
            System.out.print("informe o código do produto a remover: ");
            int codigo = scanner.nextInt();
            for (Produto p : listaProdutos) {
                if (p.codigo == codigo) {
                    listaProdutos.remove(p);
                    System.out.println("produto removido!");
                    return;
                }
            }
            System.out.println("produto não encontrado.");
        }
    
        static void buscarProdutoPorCodigo() {
            System.out.print("informe o código do produto: ");
            int codigo = scanner.nextInt();
            for (Produto p : listaProdutos) {
                if (p.codigo == codigo) {
                    System.out.println("produto encontrado: " + p);
                    return;
                }
            }
            System.out.println("produto não encontrado.");
        }
    
        static void calcularValorTotalEstoque() {
            double total = 0;
            for (Produto p : listaProdutos) {
                total += p.preco * p.quantidade;
            }
            System.out.printf("valor total do estoque: R$%.2f%n", total);
        }
    }
    
    

