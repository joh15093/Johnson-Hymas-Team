/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author lando
 */
public class Location implements Serializable{
    
    private String name;
    private String description;
    private String mapSymbol;
    private String[] gameTips;

    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String[] getGameTips() {
        return gameTips;
    }

    public void setGameTips(String[] gameTips) {
        this.gameTips = gameTips;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.mapSymbol);
        hash = 17 * hash + Arrays.deepHashCode(this.gameTips);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", description=" + description + ", mapSymbol=" + mapSymbol + ", gameTips=" + Arrays.toString(gameTips) + '}';
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (!Arrays.deepEquals(this.gameTips, other.gameTips)) {
            return false;
        }
        return true;
    }
    
    
    
}
