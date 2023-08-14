import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Item> itens;

    public Cadastro() {
        itens = new ArrayList<>();
    }

    // Método para adicionar um novo item ao cadastro
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    // Método para remover um item do cadastro
    public void removerItem(Item item) {
        itens.remove(item);
    }

    // Método para buscar um item pelo nome no cadastro
    public Item buscarItemPorNome(String nome) {
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                return item;
            }
        }
        return null; // Retorna nuloo item não for encontrado
    }

    // Método para listar todos os itens do cadastro

    public List<Item> listarItens() {
        return new ArrayList<>(itens); // Retorna uma cópia da lista de itens
    }
}

// Classe para representar os itens a serem cadastrados
class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}




