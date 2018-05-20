/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.model;

import java.io.Serializable;

/**
 *
 * @author Joejoe
 */
public class Storehouse implements Serializable{
 @Override
    public String toString() {
        return "Storehouse{" + '}';
    }

    public Storehouse(String string) {
        this.string = string;
    }

    public static Storehouse get() {
        return null;
    }
    private String string;

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


    /**
     *
     * @return
     */
    
   /* public static Storehouse get()*/
    
    /**
     *
     */
    public static void getItem() {
    }
    
}   

