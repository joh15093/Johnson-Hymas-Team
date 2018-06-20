/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Joejoe
 */
public class Storehouse implements Serializable {

    @Override
    public String toString() {
        return "Storehouse{" + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.string);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Storehouse other = (Storehouse) obj;
        return true;
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
