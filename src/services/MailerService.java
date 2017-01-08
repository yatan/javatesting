/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 * External service for sending mails
 * @author Francisco Romero Batallé
 */
public interface MailerService {
    void send(MailAddress address, Signature signature);
}
