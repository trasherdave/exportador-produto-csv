/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.exportador.produto.csv;

import java.util.List;

/**
 *
 * @author David
 */
public interface ExportadorListaProduto {

    public String abrirTabela();
    public String fecharTabela();
    public String abrirLinha();
    public String fecharLinha();
    public String fecharLinhaTitulos();
    public String abrirColuna(String valor);
    public String fecharColuna();
    public String exportar(List<Produto> listaProdutos);

    static ExportadorListaProduto newInstance() {
        return newInstance("csv");
    }

    static ExportadorListaProduto newInstance(String extensaoArquivoExportacao) {
        switch (extensaoArquivoExportacao) {
            case "csv":
                return new ExportadorListaProdutoCSV();
            default:
                throw new UnsupportedOperationException("Formato não suportado: " + extensaoArquivoExportacao);
        }
    }

}
