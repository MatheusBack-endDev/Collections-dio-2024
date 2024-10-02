package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> retornaDaPesquisa = new HashSet<>();

        if (!contatoSet.isEmpty()){
            for (Contato c: contatoSet){
                if (c.getNome().startsWith(nome)){
                    retornaDaPesquisa.add(c);
                }
            }
        }return retornaDaPesquisa;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato novoContato = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                novoContato = c;
                break;
            }
        }return novoContato;
    }
}
