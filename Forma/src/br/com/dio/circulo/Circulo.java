/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.circulo;

import br.com.fiap.calculo.Area;
import br.com.fiap.forma.Forma;

/**
 *
 * @author pf0015
 */
public class Circulo extends Forma implements Area {
    private double raio;

    public Circulo(int x, int y, double raio) {
        super(x, y);
        this.raio = raio;
    }
    
    public String toString() {
        return super.toString()+"raio = "+raio+"\n";
    }

    @Override
    public double calcularArea() {
        return Math.PI*raio*raio;
    }
    
    
    
}
