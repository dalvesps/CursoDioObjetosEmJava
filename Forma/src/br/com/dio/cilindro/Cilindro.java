/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.cilindro;

import br.com.fiap.calculo.Area;
import br.com.fiap.calculo.Volume;
import br.com.fiap.forma.Forma;

/**
para chamar ARIA E VOLUME  extends Forma implements Area, Volume{
 */
public class Cilindro extends Forma implements Area, Volume{
    private double raio, altura;

    public Cilindro(int x, int y, double raio, double altura) {
        super(x, y);
        this.raio = raio;
        this.altura = altura;
    }
    
    public String toString() {
        return super.toString()+"raio = "+raio+"\naltura = "+altura+"\n";
    }

    @Override
    public double calcularArea() {
        return 2*Math.PI*raio*altura+2*Math.PI*raio*raio;
    }

    @Override
    public double calcularVolume() {
        return Math.PI*raio*raio*altura;
    }
    
    
}
