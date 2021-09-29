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
public class Main {

    public static void main(String[] args) {
        final List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "TV", "LG", "132-A", 1200));
        produtos.add(new Produto(2, "Geladeira", "Electrolux", "Delux", 400));
        produtos.add(new Produto(3, "Notebook", "Asus", "Predator", 850));

        ExportadorListaProduto exportadorCSV = ExportadorListaProduto.newInstance("csv");
        System.out.println("Lista de Produtos em CSV\n");
        System.out.println(exportadorCSV.exportar(produtos));
    }
}
