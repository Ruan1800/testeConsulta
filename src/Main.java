import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("==== MENU ====");
            System.out.println("1 - Cadastrar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Buscar item por nome");
            System.out.println("4 - Listar todos os itens");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarItem(scanner, cadastro);
                    break;
                case 2:
                    removerItem(scanner, cadastro);
                    break;
                case 3:
                    buscarItemPorNome(scanner, cadastro);
                    break;
                case 4:
                    listarItens(cadastro);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarItem(Scanner scanner, Cadastro cadastro) {
        System.out.print("Digite o nome do item: ");
        String nome = scanner.next();
        System.out.print("Digite o preço do item: ");
        double preco = scanner.nextDouble();

        Item item = new Item(nome, preco);
        cadastro.adicionarItem(item);

        System.out.println("Item cadastrado com sucesso!");
    }

    private static void removerItem(Scanner scanner, Cadastro cadastro) {
        System.out.print("Digite o nome do item que deseja remover: ");
        String nome = scanner.next();

        Item item = cadastro.buscarItemPorNome(nome);
        if (item != null) {
            cadastro.removerItem(item);
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("Item não encontrado no cadastro.");
        }
    }

    private static void buscarItemPorNome(Scanner scanner, Cadastro cadastro) {
        System.out.print("Digite o nome do item que deseja buscar: ");
        String nome = scanner.next();

        Item item = cadastro.buscarItemPorNome(nome);
        if (item != null) {

            System.out.println("Item encontrado:");
            System.out.println(item);
        } else {
            System.out.println("Item não encontrado no cadastro.");
        }
    }

    private static void listarItens(Cadastro cadastro) {
        System.out.println("==== ITENS CADASTRADOS ====");
        for (Item item : cadastro.listarItens()) {
            System.out.println(item);
        }
        System.out.println("===========================");
    }
    }
