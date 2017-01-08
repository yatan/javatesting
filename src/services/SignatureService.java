/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import data.Signature;
import data.Vote;

/**
 * External service for signing votes.
 * @author Francisco Romero Batallé
 */
public interface SignatureService {
    Signature sign(Vote vote);
}
