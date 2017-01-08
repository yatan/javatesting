/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import kiosk.ActivationCard;

/**
 * Local service for validating activation cards
 * @author Francisco Romero Batallé
 */
public interface ValidationService {
    boolean validate(ActivationCard card);
    void deactivate(ActivationCard card);
}
