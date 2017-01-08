/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 * Represents a Signature
 * @author Francisco Romero Batallé
 */

final public class Signature {
    private final byte[] sign;
    
    public Signature(byte[] sign) {
        this.sign = sign;
    }
    
    public byte[] getSignature() {
        return sign;
    }
    
    @Override
    public String toString() {
        return "Signature{" +
        "sign='" + sign + '\'' +
        '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Signature signa = (Signature) o;
        return sign.equals(signa.sign);
    }
    
    @Override
    public int hashCode() {
        return sign.hashCode();
    }    
}
