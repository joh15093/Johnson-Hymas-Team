/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.control;

/**
 *
 * @author lando
 */
import java.util.Random;

public class CropsControl {

    /**
     * @param tithes
     * @param acresOwned
     * @return
     */
    public static double calcBushelsHarvested(double tithes, double acresOwned) {
        Random bushels = new Random();
        double bushelsHarvested = 0;
        double bushelsPerAcre = 0;
        if (tithes < 0) {
            bushelsHarvested = -1;
        } else if (tithes > 100) {
            bushelsHarvested = -1;
        } else if (tithes >= 8 && tithes <= 12) {
            bushelsPerAcre = 2 + bushels.nextInt(5);
        } else if (tithes < 8 && tithes > 0) {
            bushelsPerAcre = 1 + bushels.nextInt(4);
        } else if (tithes > 12) {
            bushelsPerAcre = 2 + bushels.nextInt(6);
        }

        bushelsHarvested = bushelsPerAcre * acresOwned;
        return bushelsHarvested;
    }

    public static double calcBushelsToTithes(double tithes) {
        return 0;
    }

    public static double calcBushelsToRats(double tithes) {
        return 0;
    }

    public static double calcTotalBushels(double tithes) {
        return 0;
    }

}
