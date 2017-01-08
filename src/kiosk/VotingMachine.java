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
    
    //Serveis externs
    ValidationService val;
    MailerService mail;
    SignatureService sign;
    VotePrinter votePrint;
    VotesDB votesdb;
    
    //Variables de la VotingMachine
    private boolean active = false;
    
    public VotingMachine() { 
        //???????
    }
    
    public void setValidationService(ValidationService validationService) {
        val = validationService;
    }
    public void setMailerService(MailerService mailerService){
        mail = mailerService;
    }
    public void setSignatureService(SignatureService signService){
        sign = signService;
    }
    public void setVotePrinter(VotePrinter votePrinter){
        votePrint = votePrinter;
    }
    public void setVotesDB(VotesDB votesDB){
        votesdb = votesDB;
    }

    public void activateEmission(ActivationCard card) throws IllegalStateException {
        val.validate(card);
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
