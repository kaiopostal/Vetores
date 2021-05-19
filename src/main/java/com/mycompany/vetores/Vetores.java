/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author kaiop
 */
public class Vetores {

    String marca[] = new String[3];
    String modelo[] = new String[3];

    public void veiculosCadastrados() {
        String resultado = "";
        String indice = "";
        int codigo = 0;

        for (int i = 0; i < marca.length; i++) {
            marca[i] = JOptionPane.showInputDialog("Digite a marca " + (i + 1));
            modelo[i] = JOptionPane.showInputDialog("Digite o modelo " + (i + 1));
            resultado += marca[i] + " - " + modelo[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código: "));
        indice = marca[codigo] + " - " + modelo[codigo];
        JOptionPane.showMessageDialog(null, indice);
        

    }
}
