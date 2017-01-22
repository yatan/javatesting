/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles;

import kiosk.ActivationCard;
import services.ValidationService;

/**
 *
 * @author Francisco Romero Batallé
 */
public class ValidationServiceDouble implements ValidationService{

    @Override
    public boolean validate(ActivationCard card) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deactivate(ActivationCard card) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
