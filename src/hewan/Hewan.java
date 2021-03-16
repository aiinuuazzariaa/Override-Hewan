/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author MOKLET-2
 */
public class Hewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NamaHewan io = new NamaHewan();
        io.hewan("Hewan ini bernama ");
        
        Makanan yo = new Makanan();
        yo.hewan("Hewan ini suka makan ");
    }
    
}
