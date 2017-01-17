/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosk;

import data.MailAddress;
import data.Signature;
import data.Vote;
import java.util.ArrayList;
import java.util.List;
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
    
    private class MailerServiceDouble implements MailerService {
        @Override
        public void send(MailAddress address, Signature signature) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class SignatureServiceDouble implements SignatureService {
        @Override
        public Signature sign(Vote vote) {
            return new Signature(vote.getOption().getBytes());
        } 
    }
    
    private class ValidationServiceDouble implements ValidationService {

        @Override
        public boolean validate(ActivationCard card) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void deactivate(ActivationCard card) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    private class VotePrinterDouble implements VotePrinter {

        @Override
        public void print(Vote vote) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    private class VoteDBDouble implements VotesDB {
        List<Vote> votes = new ArrayList();
        
        @Override
        public void registerVote(Vote vote) {
            votes.add(vote);
        }

        @Override
        public List<Vote> getVotes() {
            return votes;
        }
    }

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
     * Test of setValidationService method, of class VotingMachine.
     */
    @Test
    public void testSetValidationService() {
        System.out.println("setValidationService");
        ValidationService validationService = null;
        VotingMachine instance = new VotingMachine();
        instance.setValidationService(validationService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMailerService method, of class VotingMachine.
     */
    @Test
    public void testSetMailerService() {
        System.out.println("setMailerService");
        MailerService mailerService = null;
        VotingMachine instance = new VotingMachine();
        instance.setMailerService(mailerService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSignatureService method, of class VotingMachine.
     */
    @Test
    public void testSetSignatureService() {
        System.out.println("setSignatureService");
        SignatureService signService = null;
        VotingMachine instance = new VotingMachine();
        instance.setSignatureService(signService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVotePrinter method, of class VotingMachine.
     */
    @Test
    public void testSetVotePrinter() {
        System.out.println("setVotePrinter");
        VotePrinter votePrinter = null;
        VotingMachine instance = new VotingMachine();
        instance.setVotePrinter(votePrinter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVotesDB method, of class VotingMachine.
     */
    @Test
    public void testSetVotesDB() {
        System.out.println("setVotesDB");
        VotesDB votesDB = null;
        VotingMachine instance = new VotingMachine();
        instance.setVotesDB(votesDB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activateEmission method, of class VotingMachine.
     */
    @Test
    public void testActivateEmission() {
        System.out.println("activateEmission");
        ActivationCard card = null;
        VotingMachine instance = new VotingMachine();
        instance.activateEmission(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canVote method, of class VotingMachine.
     */
    @Test
    public void testCanVote() {
        System.out.println("canVote");
        VotingMachine instance = new VotingMachine();
        boolean expResult = false;
        boolean result = instance.canVote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vote method, of class VotingMachine.
     */
    @Test
    public void testVote() {
        System.out.println("vote");
        Vote vote = null;
        VotingMachine instance = new VotingMachine();
        instance.vote(vote);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendReceipt method, of class VotingMachine.
     */
    @Test
    public void testSendReceipt() {
        System.out.println("sendReceipt");
        MailAddress address = null;
        VotingMachine instance = new VotingMachine();
        instance.sendReceipt(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
