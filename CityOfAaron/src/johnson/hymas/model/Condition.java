/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.model;

/**
 *
 * @author lando
 */
public enum Condition {
    Good,
    Fair,
    Poor;

    @Override
    public String toString() {
        return "Condition{" + '}';
    }

    public static Condition getGood() {
        return Good;
    }

    public static Condition getFair() {
        return Fair;
    }

    public static Condition getPoor() {
        return Poor;
    }

}
