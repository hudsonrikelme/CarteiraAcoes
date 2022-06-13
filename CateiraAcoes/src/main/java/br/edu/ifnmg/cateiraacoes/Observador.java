package br.edu.ifnmg.cateiraacoes;



/**
 *  Interface para receber notificações da carteira de Ações
 * @author Rikelme
 */
public interface Observador {
    void mudancaQuantidade(String acao, Integer quantidade);
}
