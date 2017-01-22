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
    private ActivationCard activationCard;
    private Vote voteVoted;
    
    public VotingMachine() { 
        activationCard = null;
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
        //Si la maquina ja està activa, llençar excepció
        if(active) throw new IllegalStateException("Machine already active");
        if (val.validate(card)){
            activationCard = card;
            active = true;
        }
    }
    
    public boolean canVote() {
        return active;        
    }
    
    public void vote(Vote vote) throws IllegalStateException { 
        //Si pot votar, endavant
        if(canVote())
        {
            votesdb.registerVote(vote);
            votePrint.print(vote);
            //Guardem el vot, per a firmarlo en el mail.
            voteVoted = vote;
            active = false;
            val.deactivate(activationCard);
        }else
            throw new IllegalStateException("Can not vote");
    }
    
    public void sendReceipt(MailAddress address) throws IllegalStateException { 
        //Si pot votar, i ja ha votat, s'envia mail amb la firma
        if(!canVote()) throw new IllegalStateException("Can not vote");
        if(voteVoted == null) throw new IllegalStateException("Not yet voted");
        mail.send(address, sign.sign(voteVoted));
    }
    
    public ActivationCard getActivationCard() {
        return activationCard;
    }
}
