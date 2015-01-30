/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padroes.adapter;

import br.edu.padroes.sorteador.NumeroRepetidoException;
import br.edu.padroes.sorteador.SorteadorNumeros;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Magdiel Ildefonso
 */
public class Adapter implements Target{
    
    public Set<Integer> getNumbers(int min, int max, int qtde){
        //Adaptado
        SorteadorNumeros sorte = new SorteadorNumeros(min, max);
        Set<Integer> nums = new TreeSet<>();
        
        try {
            for(Integer integer : sorte.sortear(qtde)) {
                nums.add(integer);
            }
        } catch (NumeroRepetidoException ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nums;
    }
}
