
package br.com.fiap.principal;

import br.com.fiap.calculo.Area;
import br.com.fiap.calculo.Volume;
import br.com.fiap.cilindro.Cilindro;
import br.com.fiap.circulo.Circulo;
import br.com.fiap.forma.Forma;
import br.com.fiap.ponto.Ponto;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
       
        Forma[] f = new Forma[3];
        f[0] = new Cilindro(2, 5, 6.75, 8.036);
        f[1] = new Ponto(5, 3);
        f[2] = new Circulo(4, 4, 10);
        
        imprimir(f);
        
    }    
    
    public static void imprimir(Forma[] f) {
        String msg=""; 
        for(Forma i : f) {
            if(i instanceof Ponto) {
                msg += "Ponto:\n";
            }
            else if(i instanceof Circulo) {
                msg += "Círculo:\n";
            }
            else {
                msg += "Cilindro:\n";
            }
            
            msg += i+"\n";
            //acrescentar a área e o volume* Obs: atualizar o NetBeans
            if (i instanceof Area) {
                //msg += "Área = "+((Area).calcularArea())+"\n";                
                msg += "Área = " + ((Area) i).calcularArea() + "\n";
            }
        
            if(i instanceof Volume){
            msg += "Volume = "+((Volume) i).calcularVolume()+"\n";
            }
            
            
        }
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
