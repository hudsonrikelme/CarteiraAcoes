package br.edu.ifnmg.cateiraacoes;

import br.edu.ifnmg.cateiraacoes.Observador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *Classe cujos dados podem ser observados por outras classes
 * @author Rikelme
 */
public class CarteiraAcoes {
    private Map<String, Integer> acoes = new HashMap<>();
    private List<Observador> obs = new ArrayList<>();
    
    public void adicionaAcoes(String acao, Integer quantidade){
        if(acoes.containsKey(acao)){
            quantidade += acoes.get(acao);
        }
        acoes.put(acao, quantidade);
        notificar(acao, quantidade);
    }
    private void notificar(String acao, Integer quantidade){
        for(Observador o: obs)
            o.mudancaQuantidade(acao, quantidade);
    }
    public void addObservador(Observador o){
        obs.add(o);
    }
}
