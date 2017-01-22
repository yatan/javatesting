/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles;

import data.Vote;
import services.VotePrinter;

/**
 *
 * @author Francisco Romero Batallé
 */
public class VotePrinterDouble implements VotePrinter {

    @Override
    public void print(Vote vote) {
        //Simulació impresió comprovant vot.
        System.out.println("Imprimiendo voto: " + vote.toString());
    }
    
}
