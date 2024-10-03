package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendacontatos;

    public AgendaContatos() {
        this.agendacontatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendacontatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        agendacontatos.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(agendacontatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numerocontato = null;
        if (!agendacontatos.isEmpty()){
            numerocontato = agendacontatos.get(nome);
        }
        return numerocontato;
    }
}
