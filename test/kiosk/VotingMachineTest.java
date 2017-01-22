/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosk;

import data.MailAddress;
import data.Vote;
import doubles.MailerServiceDouble;
import doubles.SignatureServiceDouble;
import doubles.ValidationServiceDouble;
import doubles.VoteDBDouble;
import doubles.VotePrinterDouble;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import services.MailerService;
import services.SignatureService;
import services.ValidationService;
import services.VotePrinter;
import services.VotesDB;

/**
 *
 * @author Francisco Romero Batallé
 */
public class VotingMachineTest {
    

    MailerService mail;
    SignatureService sign;
    ValidationService val;
    VotePrinter votePrint;
    VotesDB voteDB;
    
    
    


    public VotingMachineTest() {
    }
        
    @Before
    public void setUp() {
        //Asignar recursos externs a double
        mail = new MailerServiceDouble();
        sign = new SignatureServiceDouble();
        val = new ValidationServiceDouble();
        voteDB = new VoteDBDouble();
        votePrint = new VotePrinterDouble();
    }
    


    /**
     * Test canVote després de validar tarjeta
     */
    @Test
    public void testValidarTargeta() {
        ActivationCard tarjeta = new ActivationCard("AnyCode");
        VotingMachine instance = new VotingMachine();
        instance.setValidationService(val);
        instance.setMailerService(mail);
        instance.setSignatureService(sign);
        instance.setVotePrinter(votePrint);
        instance.setVotesDB(voteDB);
        
        //Validem tarjeta
        val.validate(tarjeta);
        //Activem voting machine amb la tarjeta
        instance.activateEmission(tarjeta);
        
        assertTrue("No podem votar degut a la tarjeta", instance.canVote());
    }

    /**
     * Test canVote després de validar tarjeta
     */
    @Test
    public void testVotar() {
        ActivationCard tarjeta = new ActivationCard("AnyCode");
        Vote vot = new Vote("AnyOption");
        VotingMachine instance = new VotingMachine();
        instance.setValidationService(val);
        instance.setMailerService(mail);
        instance.setSignatureService(sign);
        instance.setVotePrinter(votePrint);
        instance.setVotesDB(voteDB);
        
        //Validem tarjeta
        val.validate(tarjeta);
        //Activem voting machine amb la tarjeta
        instance.activateEmission(tarjeta);
        
        assertTrue("No podem votar degut a la tarjeta", instance.canVote());
        
        instance.vote(vot);
        assertTrue("Vot no registrat", voteDB.getVotes().size()==1);
    }    

    /**
     * Test canVote després de validar tarjeta
     */
    @Test
    public void testDesactivar() {
        ActivationCard tarjeta = new ActivationCard("AnyCode");
        Vote vot = new Vote("AnyOption");
        VotingMachine instance = new VotingMachine();
        instance.setValidationService(val);
        instance.setMailerService(mail);
        instance.setSignatureService(sign);
        instance.setVotePrinter(votePrint);
        instance.setVotesDB(voteDB);
        
        //Validem tarjeta
        val.validate(tarjeta);
        //Activem voting machine amb la tarjeta
        instance.activateEmission(tarjeta);
        
        assertTrue("No podem votar degut a la tarjeta", instance.canVote());
        
        instance.vote(vot);
        assertTrue("Vot no registrat", voteDB.getVotes().size()==1);
        
        //Verifiquem que la tarjeta es invalida i no pot deixar tornar a votar
        val.validate(tarjeta);
        assertFalse("La maquina tindria que no deixar votar", instance.canVote());
    }   
    
}
