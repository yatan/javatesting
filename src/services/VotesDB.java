/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 * Local service that registers votes.
 * @author Francisco Romero Batallé
 */
public interface VotesDB {
    void registerVote(Vote vote);
    List<Vote> getVotes();
}
