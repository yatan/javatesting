/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosk;

/**
 * Represents an ActivationCard
 * @author Francisco Romero Batallé
 */
final public class ActivationCard {
    
    private String code;
    private boolean active;
    
    public ActivationCard(String code){
        this.code = code;
        this.active = true;
    }
    
    public boolean isActive(){
        return active;
    }
    
    public String getCode(){
        return code;
    }
    
    public void erase(){
        code = "";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivationCard card = (ActivationCard) o;
        return code.equals(card.code);
    }
    
}
