package br.com.openpdv.modelo.anexo.iv;

import br.com.openpdv.modelo.anexo.Bean;

/**
 * Classe que representa o modelo E2 do anexo IV.
 *
 * @author Pedro H. Lira
 */
public class E2 extends Bean {

    private String cnpj;
    private String codigo;
    private String descricao;
    private String unidade;
    private Double valor;
    private Double estoque;
    private String mensuracao;
    
    public E2() {
        padrao = "E2";
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getValor() {
        return valor * 100; // precisa informar os decimais sem separador
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getEstoque() {
        return estoque * 1000; // precisa informar os decimais sem separador
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }

    public String getMensuracao() {
        return Math.abs(estoque) == estoque ? "+" : "-";
    }

    public void setMensuracao(String mensuracao) {
        this.mensuracao = mensuracao;
    }
}
