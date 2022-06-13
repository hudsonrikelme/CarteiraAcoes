
package br.edu.ifnmg.cateiraacoes;

/**
 *Observa mudancas nas quantidades e registra no console
 * @author Rikelme
 */
public class AcoesLogger implements Observador{

    
    @Override
    public void mudancaQuantidade(String acao, Integer quantidade) {
        System.out.println("Alterada a quantidade da Acao"
                            + acao + " para " + quantidade);
    }
    
}
