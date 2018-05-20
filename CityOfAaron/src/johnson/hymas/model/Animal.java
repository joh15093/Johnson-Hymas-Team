/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.model;

import java.util.Objects;

/**
 *
 * @author Joejoe
 */
public class Animal {
  @Override
    public String toString() {
        return "Animal{" + '}';
    }
;
    /**
     *
     * @return
     */
    public static Animal getName() {
       return null;
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.string);
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
        final Animal other = (Animal) obj;
        return true;
    }

    public Animal(String string) {
        this.string = string;
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

    public static Animal getAge() {
        return null;
    }


}




    


