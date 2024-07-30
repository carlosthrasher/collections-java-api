package main.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> lista;
    //construtor
    public CarrinhoDeCompras() {
        this.lista = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        lista.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        if (!lista.isEmpty()) {
            for (int i = lista.size() - 1; i >= 0; i--) {
                if (lista.get(i).getNome().equals(nome)) {
                    lista.remove(i);
                    break;
                }
            };
        } else {
            throw new RuntimeException("Lista Vazia");
        }

    }
    public Double valorTotal() {
        double total = 0;
        for (Item item : lista) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
    public void exibirLista() {
        System.out.println(lista);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println(carrinho.valorTotal());
        carrinho.adicionarItem("pao",0.5,5);
        carrinho.adicionarItem("maça",1,5);
        System.out.println(carrinho.valorTotal());
        carrinho.exibirLista();
    }
}





