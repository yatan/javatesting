/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosk;

import data.MailAddress;
import data.Vote;
import services.MailerService;
import services.SignatureService;
import services.ValidationService;
import services.VotePrinter;
import services.VotesDB;

/**
 * Implements a simplification of Use Case: Emit Vote.
 * @author Francisco Romero Batallé
 */
public class VotingMachine {
    
    MailerService mail;
    SignatureService sign;
    ValidationService val;
    VotePrinter votePrint;
    VotesDB votesdb;
    
    public VotingMachine() { 
        //???????
    }
    
    public void setValidationService(ValidationService validationService) {
    //???
    }
    //... // pels altres serveis
    public void activateEmission(ActivationCard card) throws IllegalStateException {
        //???
    }
    
    public boolean canVote() {
        //???
    }
    
    public void vote(Vote vote) throws IllegalStateException { 
        //???
    }
    
    public void sendReceipt(MailAddress address) throws IllegalStateException { 
        //???
    }
}
