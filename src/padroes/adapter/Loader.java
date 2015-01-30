/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padroes.adapter;

/**
 *
 * @author Magdiel Ildefonso
 */
public class Loader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Target s = new Adapter();
        for (int num : s.getNumbers(1, 60, 6)) {
            System.out.println(num);
        }
    }
}
