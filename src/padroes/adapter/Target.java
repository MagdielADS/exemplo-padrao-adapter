/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padroes.adapter;

import java.util.Set;

/**
 *
 * @author Magdiel Ildefonso
 */
public interface Target {
    public Set<Integer> getNumbers(int min, int max, int qtde);
}
