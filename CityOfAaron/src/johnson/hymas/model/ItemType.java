/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.model;

/**
 *
 * @author Joejoe
 */
public enum ItemType {
    animal,
    tool,
    provisions;

    @Override
    public String toString() {
        return "ItemType{" + '}';
    }

    public static ItemType getanimal() {
        return animal;
    }

    public static ItemType gettool() {
        return tool;
    }

    public static ItemType getprovisions() {
        return provisions;
    }
    
}
