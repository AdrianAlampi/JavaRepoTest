/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provagit;

/**
 *
 * @author alampi.adrian
 */
public class ProvaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=2;
        while(true){
            System.out.println("ehi ciao: "+i);
            System.out.println("vediamo se funziona ");
            i=i*i;
            if(i==10000000){
                break;
            }
        }
    }
    
}
