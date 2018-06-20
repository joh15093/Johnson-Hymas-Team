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
public class Map implements Serializable {

    private Location[][] locations;
    private Point currectLocation;

    public Map() {
    }

    public Location[][] getLocations() {
        return locations;
    }

    public Point getCurrectLocation() {
        return currectLocation;
    }

    public void setCurrectLocation(Point currectLocation) {
        this.currectLocation = currectLocation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Arrays.deepHashCode(this.locations);
        hash = 47 * hash + Objects.hashCode(this.currectLocation);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + Arrays.toString(locations) + ", currectLocation=" + currectLocation + '}';
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.currectLocation, other.currectLocation)) {
            return false;
        }
        return true;
    }

}
