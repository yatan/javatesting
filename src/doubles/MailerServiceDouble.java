/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles;

import data.MailAddress;
import data.Signature;
import services.MailerService;

/**
 *
 * @author Francisco Romero Batallé
 */
public class MailerServiceDouble implements MailerService {

    @Override
    public void send(MailAddress address, Signature signature) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
