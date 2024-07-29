package main.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;
    //construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    //metodos
    public void adicionarTarefa(String descricao) {
       tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefaList.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroDeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricao() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterNumeroDeTarefas());
        listaTarefa.adicionarTarefa("Tarefa um");
        listaTarefa.adicionarTarefa("Tarefa um");
        listaTarefa.adicionarTarefa("Tarefa dois");
        System.out.println(listaTarefa.obterNumeroDeTarefas());

        listaTarefa.removerTarefa("Tarefa dois");
        System.out.println(listaTarefa.obterNumeroDeTarefas());
       listaTarefa.obterDescricao();
    }
}
