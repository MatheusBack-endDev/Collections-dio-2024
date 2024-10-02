package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> StringSet;

    public ConjuntoPalavrasUnicas() {
        StringSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        StringSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!StringSet.isEmpty()){
            if(StringSet.contains(palavra)){
                StringSet.remove(palavra);
            }
        }
    }

    public boolean verificarPalavra(String palavra){
        return StringSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!StringSet.isEmpty()){
            System.out.println(StringSet);
        }
    }
}
