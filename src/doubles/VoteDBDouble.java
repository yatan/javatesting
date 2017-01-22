/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles;

import data.Vote;
import java.util.ArrayList;
import java.util.List;
import services.VotesDB;

/**
 *
 * @author Francisco Romero Batallé
 */
public class VoteDBDouble implements VotesDB{
    private List<Vote> llistatVots = new ArrayList<>();
    
    @Override
    public void registerVote(Vote vote) {
        llistatVots.add(vote);
    }

    @Override
    public List<Vote> getVotes() {
        return llistatVots;
    }
    
}
