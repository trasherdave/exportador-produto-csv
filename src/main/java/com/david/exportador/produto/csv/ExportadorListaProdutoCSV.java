/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.exportador.produto.csv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class ExportadorListaProdutoCSV extends AbstractExportadorListaProduto {
    
     private static final String SEPARADOR_LN = "\n";
    private static final String SEPARADOR_COL = ",";

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String fecharLinhaTitulos() {
         return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return valor;
    }

    @Override
    public String fecharColuna() {
        return "" + SEPARADOR_COL;
    }

}
