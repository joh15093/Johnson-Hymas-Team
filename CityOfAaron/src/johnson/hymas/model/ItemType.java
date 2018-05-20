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
    private String string;

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return string.hashCode();
    }

    private ItemType(String string) {
        this.string = string;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }


    public static ItemType getAnimal() {
        return animal;
    }

    public static ItemType getTool() {
        return tool;
    }

    public static ItemType getProvisions() {
        return provisions;
    }
    
}
